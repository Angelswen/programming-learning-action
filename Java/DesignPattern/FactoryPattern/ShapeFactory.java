package com.vechace.FactoryPattern;

/**
 * ����ģʽ
 * @author asus-pc
 *
 */
public class ShapeFactory {
	
	//ʹ��getShape������ȡ��״���͵Ķ���
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
