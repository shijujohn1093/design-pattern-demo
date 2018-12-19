package com.thengara.dp.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer<T> implements Runnable {

	private final ObjectPool<T> objectPool;
	private final int seconds;
	private final BlockingQueue<T> queuer;

	public Consumer(int seconds, ObjectPool<T> objectPool, BlockingQueue<T> queuer) {
		this.seconds = seconds;
		this.objectPool = objectPool;
		this.queuer = queuer;
	}

	@Override
	public void run() {

		while (true) {

			try {
				System.out.println("Consumer Started ------- >");

				T object = objectPool.getObject();
				queuer.put(object);
				System.out.println("Consumer --> " + object.toString() + " waiting for " + seconds);
				Thread.sleep(TimeUnit.SECONDS.toMillis(seconds));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
