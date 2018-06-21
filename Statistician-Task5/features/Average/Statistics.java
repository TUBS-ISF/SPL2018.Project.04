import java.util.List;

import interfaces.IDataLoader;
import loadData.JsonLoadData;

public class Statistics {

	public double execute(List<Double> list) {
		original(list);
		if(list == null || list.isEmpty()) return 0.0;
		double average = 0.0;
		for (Double value: list) {
			average += value.doubleValue();
		}
		double result = average/(double) list.size();
		System.out.println(counter + ". Average: " + result);
		counter++;
		return result;	
	}
}
