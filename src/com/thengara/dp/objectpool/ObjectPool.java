package com.thengara.dp.objectpool;

import java.util.Hashtable;
import java.util.Map.Entry;

public abstract class ObjectPool<T> {

	private final Long exirationTime;
	private final int poolSize;
	private volatile Hashtable<T, Long> locked, unlocked;

	public ObjectPool(Long expirationTime, int poolSize) {
		this.exirationTime = expirationTime;
		this.poolSize = poolSize;
		this.locked = new Hashtable<>();
		this.unlocked = new Hashtable<>();
	}

	protected abstract T create();
	protected abstract void expire(T object);
	public abstract boolean validate(T object);

	public synchronized T getObject() {
		if (locked.size() >= poolSize) {
			try {
				System.out.println("Thread poll size exausted, waiting for pool to be freed");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long currentTime = System.currentTimeMillis();
		T objectToReturn = null;
		for (Entry<T, Long> entry : unlocked.entrySet()) {
			Long timeWhenObjectAdded = entry.getValue();
			objectToReturn = entry.getKey();
			unlocked.remove(objectToReturn);

			if ((currentTime = timeWhenObjectAdded) > exirationTime) {
				objectToReturn = null;
				expire(objectToReturn);
			} else if (!validate(objectToReturn)) {
				objectToReturn = null;;
			}
			if (objectToReturn == null) {
				objectToReturn = create();
			}
			locked.put(objectToReturn, currentTime);
			break;

		}
		return objectToReturn;

	}

	public synchronized void releaseObject(T object) {
		locked.remove(object);
		unlocked.put(object, System.currentTimeMillis());
		notifyAll();

	}

}
