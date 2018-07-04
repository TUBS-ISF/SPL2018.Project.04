import java.util.List;

public privileged aspect Minimum {
	after(List<Double> list, Statistics s): execution(double Statistics.execute(List<Double>)) && args(list) && this(s) {
		if(!(list == null || list.isEmpty())) {
			System.out.printf(s.counter + ". Minimum: %s \n", list.get(0).doubleValue());
			s.counter++;
		}	
	}
}
