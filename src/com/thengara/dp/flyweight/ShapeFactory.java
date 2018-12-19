package com.thengara.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	Map<String, Circle> circles = new HashMap<>();
	public Circle getCircle(String color) {

		Circle circle = circles.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circles.put(color, circle);
		}

		return circle;

	}
}
