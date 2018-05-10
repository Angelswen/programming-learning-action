package com.vechace.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equals("CIRCLE")){
			return new Circle();
		}else if(shapeType.equals("RACTANGLE")){
			return new Ractangle();
		}else if(shapeType.equals("SQUARE")){
			return new Square();
		}else{
			return null;
		}
	}

}
