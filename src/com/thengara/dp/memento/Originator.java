package com.thengara.dp.memento;

public class Originator {

	private String state;

	public Originator() {
		// TODO Auto-generated constructor stub
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveSateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		this.setState(memento.getState());
	}

	@Override
	public String toString() {
		return "Originator [state=" + state + "]";
	}

}
