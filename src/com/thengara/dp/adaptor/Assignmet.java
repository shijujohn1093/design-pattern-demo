package com.thengara.dp.adaptor;

public class Assignmet {

	private Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void performAssignment(String notes) {
		pen.write(notes);
	}
}
