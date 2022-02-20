package app;

import contextExecution.Context;
import strategyImpl.Addition;
import strategyImpl.Multiply;
import strategyImpl.Soustraction;

public class StrategyExample {

	public static void main(String[] args) {
		//Addition
		Context context1 = new Context(new Addition());
		System.out.println("Addition "+context1.executeStrategy(10, 10));
		
		//Soustraction
		Context context2 = new Context(new Soustraction());
		System.out.println("Soustraction "+context2.executeStrategy(10, 10));
		
		//Multiplication
		Context context3 = new Context(new Multiply());
		System.out.println("Multiplication "+context3.executeStrategy(10, 10));

	}

}
