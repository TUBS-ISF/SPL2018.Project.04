

import java.util.List;
import interfaces.IMathOperation;

public class Average implements IMathOperation {

	
	@Override
	public double execute(List<Double> list) {
		if(list == null || list.isEmpty()) return 0.0;
		double average = 0.0;
		for (Double value: list) {
			average += value.doubleValue();
		}
		return average/(double) list.size();
	}

	@Override
	public String getName() {
		return "Average";
	}

}
