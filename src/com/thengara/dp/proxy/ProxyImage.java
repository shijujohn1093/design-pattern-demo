package com.thengara.dp.proxy;

public class ProxyImage implements Image {

	private final String fileName;
	private RealImage realImageCache;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void dispaly() {
		if (realImageCache == null) {
			realImageCache = new RealImage(fileName);
		}
		realImageCache.dispaly();
	}

}
