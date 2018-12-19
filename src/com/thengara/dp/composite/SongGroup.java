package com.thengara.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent {

	private final String groupName;
	private final String groupDescription;
	List<SongComponent> songs = new ArrayList<>();
	List<SongComponent> songGroups = new ArrayList<>();

	public SongGroup(String groupName, String groupDescriptiopn) {
		super();
		this.groupName = groupName;
		groupDescription = groupDescriptiopn;
	}

	public void addSongs(SongComponent song) {
		songs.add(song);
	}
	public void addSongGroup(SongComponent songGroup) {
		songGroups.add(songGroup);
	}

	@Override
	public void displayInfo() {

		System.out.println("Group Name : " + groupName);
		System.out.println("Description : " + groupDescription);

		for (SongComponent song : songs) {
			song.displayInfo();
		}
		System.out.println("-----------------------------------");
		for (SongComponent songGroup : songGroups) {
			songGroup.displayInfo();
		}

	}

}
