package mathOperations;

import java.util.List;

import interfaces.IMathOperation;

public class Percentile<N extends Number> implements IMathOperation<N, Double> {

	private List<N> list;
	private double percent;
	
	/*
	 * acts then just as a median
	 */
	public Percentile(List<N> list) {
		this.list = list;
		this.percent = 0.5;
	}
	
	public Percentile(List<N> list, double percent) {
		this.list = list;
		this.percent = percent;
	}
	
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	@Override
	public Double execute() {
		double wantedIndex = list.size() * percent;
		return isInteger(wantedIndex) ? ((list.get((int) (wantedIndex - 1)).doubleValue() + list.get((int) wantedIndex).doubleValue()) / 2) 
									  : list.get((int) (Math.ceil(wantedIndex) - 1)).doubleValue();
	}
	
	private boolean isInteger(double number) {
		return number == Math.floor(number) && !Double.isInfinite(number);
	}

}
