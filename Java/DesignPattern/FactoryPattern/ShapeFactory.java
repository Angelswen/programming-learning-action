package com.vechace.FactoryPattern;

/**
 * 工厂模式
 * @author asus-pc
 *
 */
public class ShapeFactory {
	
	//使用getShape方法获取形状类型的对象
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}else if(shapeType.equals("CIRCLE")){
			return new Circle();
		}else if(shapeType.equals("RECTANGLE")){
			return new Rectangle();
		}else if(shapeType.equals("SQUARE")){
			return new Square();
		}else{
			return null ;
		}
		
	}
	
}
