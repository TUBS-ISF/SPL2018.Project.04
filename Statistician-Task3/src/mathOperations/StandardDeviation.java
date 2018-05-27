package mathOperations;

import java.util.List;

import interfaces.IMathOperation;

public class StandardDeviation<N extends Number> implements IMathOperation<N, Double> {
	
	private List<N> list;

	public StandardDeviation(List<N> list) {
		this.list = list;
	}
	
	@Override
	public Double execute() {
		double average = new Average<N>(list).execute();
		double result = 0.0;
		for (Number value: list) {
			result += Math.pow(value.doubleValue() - average , 2);
		}
		return Math.sqrt(result/list.size());
	}

}
