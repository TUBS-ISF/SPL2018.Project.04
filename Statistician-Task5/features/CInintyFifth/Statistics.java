import java.util.List;

import interfaces.IDataLoader;
import loadData.JsonLoadData;

public class Statistics {

	public double execute(List<Double> list) {
		original(list);
		double average = 0.0;
		for(Double item: list) {
			average += item.doubleValue();
		}
		average = average/(double)list.size();
		
		double standardDeviation = 0.0;
		for (Double value: list) {
			standardDeviation += Math.pow(value.doubleValue() - average , 2);
		}
		standardDeviation = Math.sqrt(standardDeviation/list.size());
		
		double result = 1.96 * (standardDeviation/(double) Math.sqrt(list.size()));
		
		System.out.println(counter + ". 95th Confidence Interval: " + average + " \u00B1 " + result);
		counter++;
		return result;
	}	
}
