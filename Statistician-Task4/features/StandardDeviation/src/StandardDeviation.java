
import java.util.List;

import interfaces.IMathOperation;

public class StandardDeviation implements IMathOperation {
	
	
	@Override
	public double execute(List<Double> list) {
		double average = 0.0;
		/*double average = () -> {
			double result = 0.0;
			for(Double item: list) {
				result += item.doubleValue();
			}
			return result/(double)list.size();
		}*/
		//double average = new Average().execute(list);
		for(Double item: list) {
			average += item.doubleValue();
		}
		average = average/(double)list.size();
		
		double result = 0.0;
		for (Double value: list) {
			result += Math.pow(value.doubleValue() - average , 2);
		}
		return Math.sqrt(result/list.size());
	}

	@Override
	public String getName() {
		return "standard deviation";
	}

}
