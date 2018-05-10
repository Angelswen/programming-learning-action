package com.vechace.AdapterPattern;

public class VlcPlayer implements AdvancePlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Play vlc file Name: " +fileName);

	}

	@Override
	public void playMp4(String fileName) {

	}

}
