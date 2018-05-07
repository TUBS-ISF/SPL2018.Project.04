package mathOperations;

import java.util.List;
import interfaces.IMathOperation;

public class Median<N extends Number> implements IMathOperation<N, Double> {

	private List<N> list;
	
	public Median(List<N> list) {
		this.list = list;
	}
	
	@Override
	public Double execute() {
		if(list == null || list.isEmpty()) return 0.0;
		if(list.size() % 2 == 0) {
			double midElem1 =  list.get((list.size()/2) - 1).doubleValue(); // first middle element. List start with 0
			double midElem2 = list.get(list.size()/2).doubleValue();  // second middle element
			return (midElem1 + midElem2) / 2.0;
		} else {
			return list.get((list.size()/2)).doubleValue();
		}
	}

}
