package com.thengara.dp.iterator;

public class TestIterator {

	public static void main(String[] args) {

		MyCustomList<String> myList = new MyCustomList<>();

		myList.add("Shiju");
		myList.add("Shiju1");
		myList.add("Shiju2");
		myList.add("Shiju3");
		myList.add("Shiju4");
		myList.add("Shiju5");

		Iterator<String> iterator = myList.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
