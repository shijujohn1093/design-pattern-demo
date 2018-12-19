package com.thengara.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {

		test();
	}
	public static long test() {
		String[] colors = {"BLACK", "WHITE", "RED", "GREEN", "BLUE", "PURPLE", "INDIGO", "ORANGE", "YELLOW", "PINK"};

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {

			ShapeFactory factory = new ShapeFactory();
			Circle circle = factory.getCircle(colors[getColorIndex()]);

			circle.setX(getX());
			circle.setY(getY());
			circle.setRadius(100);
		}
		long endTime = System.currentTimeMillis();

		long timeTaken = endTime - startTime;

		System.out.print(timeTaken + "+");
		return timeTaken;

	}

	public static int getX() {
		return (int) (Math.random() * 100);
	}

	public static int getY() {
		return (int) (Math.random() * 100);
	}

	public static int getColorIndex() {
		return (int) (Math.random() * 10 / 1);
	}
}
