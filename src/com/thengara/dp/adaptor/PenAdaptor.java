package com.thengara.dp.adaptor;

public class PenAdaptor implements Pen {
	private final SomeOtherPen someOtherPen;

	public PenAdaptor(SomeOtherPen someOtherPen) {
		this.someOtherPen = someOtherPen;
	}

	@Override
	public void write(String stmt) {
		someOtherPen.mark(stmt);;
	}

}
