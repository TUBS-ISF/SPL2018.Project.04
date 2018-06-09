import java.util.List;

import interfaces.IMathOperation;
import utils.MathUtils;

public class Pninetieth implements IMathOperation {

	@Override
	public double execute(List<Double> list) {
		double wantedIndex = list.size() * 0.9;
		return MathUtils.isInteger(wantedIndex) ? ((list.get((int) (wantedIndex - 1)).doubleValue() + list.get((int) wantedIndex).doubleValue()) / 2) 
									  : list.get((int) (Math.ceil(wantedIndex) - 1)).doubleValue();
	}

	@Override
	public String getName() {
		return "90th Percentile";
	}

}
