package com.vechace.StrategyPattern;

public class StategyPatternDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new Operation());
		System.out.println("10 + 5 = " +context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " +context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = "+context.executeStrategy(10, 5));
	}

}
