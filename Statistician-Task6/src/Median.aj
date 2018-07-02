import java.util.List;

public privileged aspect Median {

	after(List<Double> list, Statistics s): execution(double Statistics.execute(List<Double>)) && args(list) && this(s) {
		double result = 0;
		if(!(list == null || list.isEmpty())) {
			if(list.size() % 2 == 0) {
				double midElem1 =  list.get((list.size()/2) - 1).doubleValue(); // first middle element. List start with 0
				double midElem2 = list.get(list.size()/2).doubleValue();  // second middle element
				result = (midElem1 + midElem2) / 2.0;
				System.out.println(s.counter + ". Median: " + result);
				s.counter++;
			} else {
				result = list.get((list.size()/2)).doubleValue();
				System.out.println(s.counter + ". Median: " + result);
				s.counter++;
			}
		}	
	}
}
