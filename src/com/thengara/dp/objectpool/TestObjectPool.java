package com.thengara.dp.objectpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestObjectPool {

	public static void main(String[] args) {
		BlockingQueue<Person> queuer = new ArrayBlockingQueue(999999);
		PersonObjectPool pool = new PersonObjectPool();

		new Thread(new Releaser<Person>(5, pool, queuer)).start();
		new Thread(new Consumer<Person>(1, pool, queuer)).start();

	}

}
