package com.thengara.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		String fileName = "file1_abc.txt";

		ProxyImage image = new ProxyImage(fileName);

		image.dispaly();
		System.out.println("------------");
		image.dispaly();
	}
}
