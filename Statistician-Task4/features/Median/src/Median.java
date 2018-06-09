

import java.util.List;
import interfaces.IMathOperation;

public class Median implements IMathOperation {

	
	@Override
	public double execute(List<Double> list) {
		if(list == null || list.isEmpty()) return 0.0;
		if(list.size() % 2 == 0) {
			double midElem1 =  list.get((list.size()/2) - 1).doubleValue(); // first middle element. List start with 0
			double midElem2 = list.get(list.size()/2).doubleValue();  // second middle element
			return (midElem1 + midElem2) / 2.0;
		} else {
			return list.get((list.size()/2)).doubleValue();
		}
	}

	@Override
	public String getName() {
		return "Median";
	}

}
