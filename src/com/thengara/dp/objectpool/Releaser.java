package com.thengara.dp.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Releaser<T> implements Runnable {

	private final ObjectPool<T> objectPool;
	private final int seconds;
	private final BlockingQueue<T> queuer;

	public Releaser(int seconds, ObjectPool<T> objectPool, BlockingQueue<T> queuer) {
		this.seconds = seconds;
		this.objectPool = objectPool;
		this.queuer = queuer;
	}

	@Override
	public void run() {

		while (true) {

			try {
				System.out.println("Releaser Started ------- >");

				T object = queuer.take();
				objectPool.releaseObject(object);
				System.out.println("Releaser --> " + object.toString() + " waiting for " + seconds);

				Thread.sleep(TimeUnit.SECONDS.toMillis(seconds));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
