package com.vechace.TemplatePattern;

public abstract class Game {
	abstract void initalize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play(){
		
		initalize();
		startPlay();
		endPlay();
		
	}
}
