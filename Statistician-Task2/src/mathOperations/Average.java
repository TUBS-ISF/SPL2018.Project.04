package mathOperations;

import java.util.List;
import interfaces.IMathOperation;

public class Average<N extends Number> implements IMathOperation<N, Double> {

	private List<N> list;
	
	public Average(List<N> list) {
		this.list = list;
	}
	
	@Override
	public Double execute() {
		if(list.isEmpty()) return 0.0;
		double average = 0;
		for (N value: list) {
			average += value.doubleValue();
		}
		return average/(double) list.size();
	}

}
