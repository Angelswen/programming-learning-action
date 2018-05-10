package com.vechace.PrototypePattern;

public class Square extends Shape {
	
	public Square(){
		type = "Square";
		
	}
	@Override
	void drew() {
		System.out.println("Inside Square: draw() method. ");
	}

}
