package com.thengara.dp.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private final List<Drink> drinks = new ArrayList<>();
	private final List<Dessert> desserts = new ArrayList<>();
	private final List<MainCourse> mainCourses = new ArrayList<>();

	public Drink[] getDrinks() {
		return (Drink[]) drinks.toArray();
	}
	public Dessert[] getDesserts() {
		return (Dessert[]) desserts.toArray();
	}
	public MainCourse[] getMainCourses() {
		return (MainCourse[]) mainCourses.toArray();
	}

	public void addToDrink(Drink drink) {
		drinks.add(drink);
	}

	public void addToDessert(Dessert dessert) {
		desserts.add(dessert);
	}

	public void addToMainCourse(MainCourse mainCourse) {
		mainCourses.add(mainCourse);
	}
	@Override
	public String toString() {
		return "Meal [drinks=" + drinks + ", desserts=" + desserts + ", mainCourses=" + mainCourses + "]";
	}

}