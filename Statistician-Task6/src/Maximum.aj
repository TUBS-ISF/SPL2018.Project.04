import java.util.List;

public privileged aspect Maximum {
	after(List<Double> list, Statistics s): execution(double Statistics.execute(List<Double>)) && args(list) && this(s) {
		if(!(list == null || list.isEmpty())) {
			System.out.printf(s.counter + ". Maximum: %s \n", list.get(list.size()-1).doubleValue());
			s.counter++;
		}	
	}
}
