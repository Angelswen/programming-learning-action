package com.vechace.PrototypePattern;

public class Circle extends Shape {
	
	public Circle(){
		type = "Circle";
	}
	@Override
	void drew() {
		System.out.println("Inside Circle: draw() method .");
	}

}
