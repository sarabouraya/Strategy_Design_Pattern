package contextExecution;

import strategy.Strategy;

public class Context {
	private Strategy Strategy;

	public Context() {
		
	}
	public Context(Strategy strategy) {
		super();
		Strategy = strategy;
	}
	public double executeStrategy(int a,int b) {
		return Strategy.execute(a, b);
	}
	
	
	
}
