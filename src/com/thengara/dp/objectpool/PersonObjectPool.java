package com.thengara.dp.objectpool;

public class PersonObjectPool extends ObjectPool<Person> {

	private int counter = 0;

	public PersonObjectPool(Long expirationTime, int poolSize) {
		super(expirationTime, poolSize);
	}

	public PersonObjectPool() {
		super(30000L, 5);
	}

	@Override
	protected Person create() {
		return new Person("Shiju + " + ++counter);
	}

	@Override
	protected void expire(Person object) {
	}

	@Override
	public boolean validate(Person object) {
		return true;
	}

}
