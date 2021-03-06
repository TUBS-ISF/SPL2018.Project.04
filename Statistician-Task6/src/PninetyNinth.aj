import java.util.List;

import utils.MathUtils;

public privileged aspect PninetyNinth {
	
	
	after(List<Double> list, Statistics s): execution(double Statistics.execute(List<Double>)) && args(list) && this(s) {
		if(!(list == null || list.isEmpty())) {
			double wantedIndex = list.size() * 0.99;
			double result = MathUtils.isInteger(wantedIndex) ? ((list.get((int) (wantedIndex - 1)).doubleValue() + list.get((int) wantedIndex).doubleValue()) / 2) 
					  : list.get((int) (Math.ceil(wantedIndex) - 1)).doubleValue();
			System.out.println(s.counter + ". 99th Percentile: " + result);
			s.counter++;
		}	
	}
	
}