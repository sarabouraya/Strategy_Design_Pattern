package strategyImpl;

import strategy.Strategy;

public class Soustraction implements Strategy{

	@Override
	public double execute(int a, int b) {
		return a - b;
	}

}
