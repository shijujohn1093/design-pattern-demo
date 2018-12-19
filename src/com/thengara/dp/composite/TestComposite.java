package com.thengara.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		SongGroup group1 = new SongGroup("parent_group1", "parent_description1");

		SongGroup group2 = new SongGroup("parent_group2", "parent_description2");
		SongGroup group3 = new SongGroup("parent_group3", "parent_description3");

		group1.addSongGroup(group2);
		group2.addSongGroup(group3);

		group1.addSongs(new Song("song1_1", "song_des1_1"));
		group1.addSongs(new Song("song1_2", "song_des1_2"));

		group2.addSongs(new Song("song2_1", "song_des2_1"));
		group2.addSongs(new Song("song2_2", "song_des2_2"));

		group3.addSongs(new Song("song3_1", "song_des3_1"));
		group3.addSongs(new Song("song3_2", "song_des3_2"));

		group1.displayInfo();

	}
}
