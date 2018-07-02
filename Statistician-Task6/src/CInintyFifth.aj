import java.util.List;

public privileged aspect CInintyFifth {

	after(List<Double> list, Statistics s): execution(double Statistics.execute(List<Double>)) && args(list) && this(s) {
		if(!(list == null || list.isEmpty())) {
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
			
			System.out.printf(s.counter + ". 95th Confidence Interval: %.5f \u00B1 %.5f \n", average, result);
			s.counter++;
		}	
	}
}
