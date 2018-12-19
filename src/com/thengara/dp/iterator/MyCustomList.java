package com.thengara.dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T> implements Iterable<T> {

	List<T> myList = new ArrayList<>();

	@Override
	public Iterator<T> getIterator() {
		return new Iterator<T>() {

			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < myList.size() - 1;
			}

			@Override
			public T next() {
				T object = null;
				if (hasNext()) {
					object = myList.get(index++);
				}
				return object;
			}

		};
	}

	public void add(T object) {
		myList.add(object);
	}

	public void remove(T objec) {
		myList.remove(objec);
	}

}
