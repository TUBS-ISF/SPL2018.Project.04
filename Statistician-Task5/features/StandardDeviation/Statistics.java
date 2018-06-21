import java.util.List;

import interfaces.IDataLoader;
import loadData.JsonLoadData;

public class Statistics {

	public double execute(List<Double> list) {
		original(list);
		double average = 0.0;
		/*double average = list.forEach((d) -> {
			average += d.doubleValue();
		}) (double) / list.size();*/
		//double average = new Average().execute(list);
		for(Double item: list) {
			average += item.doubleValue();
		}
		average = average/(double)list.size();
		
		double result = 0.0;
		for (Double value: list) {
			result += Math.pow(value.doubleValue() - average , 2);
		}
		result = Math.sqrt(result/list.size());
		System.out.println(counter + ". Standard deviation : " + result);
		counter++;
		return result;
	}
}
