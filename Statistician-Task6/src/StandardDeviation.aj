import java.util.List;

public privileged aspect StandardDeviation {

	declare precedence : *, Median, Average;

	after(List<Double> list, Statistics s): execution(double Statistics.execute(List<Double>)) && args(list) && this(s) {
		if(!(list == null || list.isEmpty())) {
			double average = 0.0;
			for(Double item: list) {
				average += item.doubleValue();
			}
			average = average/(double)list.size();
			
			double result = 0.0;
			for (Double value: list) {
				result += Math.pow(value.doubleValue() - average , 2);
			}
			result = Math.sqrt(result/list.size());
			System.out.printf(s.counter + ". Standard deviation: %.5f \n", result);
			s.counter++;
		}
	}	
}
