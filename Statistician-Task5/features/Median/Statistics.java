import java.util.List;

import interfaces.IDataLoader;
import loadData.JsonLoadData;

public class Statistics {

	public double execute(List<Double> list) {
		original(list);
		double result = 0;
		if(list == null || list.isEmpty()) return 0.0;
		if(list.size() % 2 == 0) {
			double midElem1 =  list.get((list.size()/2) - 1).doubleValue(); // first middle element. List start with 0
			double midElem2 = list.get(list.size()/2).doubleValue();  // second middle element
			result = (midElem1 + midElem2) / 2.0;
			System.out.println(counter + ". Median: " + result);
			counter++;
			return result;
		} else {
			result = list.get((list.size()/2)).doubleValue();
			System.out.println(counter + ". Median: " + result);
			counter++;
			return result;
		}
		
	}
}
