package com.thengara.dp.adaptor;

public class TestAdaptor {
	public static void main(String[] args) {
		Assignmet assignment = new Assignmet();
		Pen pen = new PenAdaptor(new SomeOtherPen());

		assignment.setPen(pen);
		assignment.performAssignment("Hello World !!");

	}
}
