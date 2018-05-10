package com.vechace.AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color == null){
			return null;
		}else if(color.equals("RED")){
			return new Red();
		}else if(color.equals("GREEN")){
			return new Green();
		}else if(color.equals("BLUE")){
			return new Blue();
		}else{
			return null;
		}
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
