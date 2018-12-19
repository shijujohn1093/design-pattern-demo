package com.thengara.dp.builder;

public abstract class AbstractMealBuilder {
	protected Meal meal = new Meal();
	public abstract AbstractMealBuilder includeDrink();
	public abstract AbstractMealBuilder includeDessert();
	public abstract AbstractMealBuilder includeMain();

	public Meal buildMeal() {
		return meal;
	}

}
