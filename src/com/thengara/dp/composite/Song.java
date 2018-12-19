package com.thengara.dp.composite;

public class Song extends SongComponent {

	private final String songName;
	private final String songDescription;

	public Song(String songName, String songDescriptiopn) {
		super();
		this.songName = songName;
		this.songDescription = songDescriptiopn;
	}

	@Override
	public void displayInfo() {
		System.out.println("Song Name : " + songName);
		System.out.println("Song Description : " + songDescription);
	}

}
