package com.thengara.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		AdultMealBuilder adultMealBuilder = new AdultMealBuilder();
		Meal adultMeal = adultMealBuilder.includeDessert().includeDrink().buildMeal();
		System.out.println(adultMeal);
	}
}
