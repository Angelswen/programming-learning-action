package com.vechace.AdapterPattern;

public class MediaAdapter implements MediaPlayer {
	
	AdvancePlayer advancePlayer;
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc")){
			advancePlayer = new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancePlayer = new Mp4Player();
		}else{
			
		}
	}
	

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancePlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancePlayer.playMp4(fileName);
		}

	}

}
