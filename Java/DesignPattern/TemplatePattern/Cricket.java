package com.vechace.TemplatePattern;

public class Cricket extends Game {

	@Override
	void initalize() {
		System.out.println("cricket game initialize,start playing");

	}

	@Override
	void startPlay() {
		System.out.println("cricket game started . enjoy the game ");
	}

	@Override
	void endPlay() {
		System.out.println("cricket game finished ");
	}

}
