package com.thengara.dp.bridge;

public class Circle extends AbstractCircle {

	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawCircleApi drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawCircleApi.draw(x, y, radius);
	}

}
