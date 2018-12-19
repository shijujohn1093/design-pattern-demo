package com.thengara.dp.proxy;

public class RealImage implements Image {

	private final String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk();
	}

	@Override
	public void dispaly() {
		System.out.println("Displaying: " + fileName);
	}

	private void loadFromDisk() {
		System.out.println("Loading " + fileName);
	}

}
