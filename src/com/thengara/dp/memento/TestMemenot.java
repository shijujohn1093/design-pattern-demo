package com.thengara.dp.memento;

public class TestMemenot {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveSateToMemento());
		originator.setState("State #3");
		careTaker.add(originator.saveSateToMemento());
		originator.setState("State #4");
		careTaker.add(originator.saveSateToMemento());
		originator.setState("State #5");
		careTaker.add(originator.saveSateToMemento());
		originator.setState("State #6");
		careTaker.add(originator.saveSateToMemento());

		System.out.println(originator);
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println(originator);
		originator.getStateFromMemento(careTaker.get(4));
		System.out.println(originator);
		originator.getStateFromMemento(careTaker.get(2));
		System.out.println(originator);
	}
}
