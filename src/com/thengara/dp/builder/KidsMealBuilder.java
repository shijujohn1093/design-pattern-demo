package com.thengara.dp.builder;

public class KidsMealBuilder extends AbstractMealBuilder {

	@Override
	public KidsMealBuilder includeDrink() {
		meal.addToDrink(new Drink("kids-drink"));
		return this;
	}

	@Override
	public KidsMealBuilder includeDessert() {
		meal.addToDessert(new Dessert("kids-dessert"));
		return this;
	}

	@Override
	public KidsMealBuilder includeMain() {
		meal.addToMainCourse(new MainCourse("kids-main-course"));
		return this;
	}

}
