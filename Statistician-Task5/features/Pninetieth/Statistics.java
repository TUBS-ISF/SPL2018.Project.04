import java.util.List;

import interfaces.IDataLoader;
import loadData.JsonLoadData;
import utils.MathUtils;

public class Statistics {

	public double execute(List<Double> list) {
		original(list);
		double wantedIndex = list.size() * 0.9;
		double result = MathUtils.isInteger(wantedIndex) ? ((list.get((int) (wantedIndex - 1)).doubleValue() + list.get((int) wantedIndex).doubleValue()) / 2) 
				  : list.get((int) (Math.ceil(wantedIndex) - 1)).doubleValue();
		System.out.println(counter + ". 90th Percentile: " + result);
		counter++;
		return result;
	}
}
