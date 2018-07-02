import java.util.List;

public privileged aspect Average {

	after(List<Double> list, Statistics s): execution(double Statistics.execute(List<Double>)) && args(list) && this(s) {
		if(!(list == null || list.isEmpty())) {
			double average = 0.0;
			for (Double value: list) {
				average += value.doubleValue();
			}
			double result = average/(double) list.size();
			System.out.printf(s.counter + ". Average: %.5f \n", result);
			s.counter++;
		}	
	}
}
