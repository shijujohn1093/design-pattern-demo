package com.thengara.dp.bridge;

public abstract class AbstractCircle implements Shape {

	protected final DrawCircleApi drawCircleApi;

	public AbstractCircle(DrawCircleApi drawCircleApi) {
		super();
		this.drawCircleApi = drawCircleApi;
	}

}
