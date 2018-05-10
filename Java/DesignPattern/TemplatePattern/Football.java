package com.vechace.TemplatePattern;

public class Football extends Game {

	@Override
	void initalize() {
		System.out.println("football game initialize , start playing ");
	}

	@Override
	void startPlay() {
		System.out.println("football game started,enjoy the game ");
	}

	@Override
	void endPlay() {
		//System.out.println("football game end ");
	}

}
