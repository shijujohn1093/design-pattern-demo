package com.thengara.dp.builder;

public class AdultMealBuilder extends AbstractMealBuilder {

	@Override
	public AdultMealBuilder includeDrink() {
		meal.addToDrink(new Drink("adult-drink"));
		return this;
	}

	@Override
	public AdultMealBuilder includeDessert() {
		meal.addToDessert(new Dessert("adult-dessert"));
		return this;
	}

	@Override
	public AdultMealBuilder includeMain() {
		meal.addToMainCourse(new MainCourse("adult-main-course"));
		return this;
	}

}
