package com.vechace.PrototypePattern;

public class Rectangle extends Shape {
	
	public Rectangle(){
		type = "Rectangle";
	}
	
	@Override
	void drew() {
		System.out.println("Inside Rectangle:Draw() method. ");

	}

}
