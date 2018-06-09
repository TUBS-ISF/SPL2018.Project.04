import java.util.List;

import interfaces.IMathOperation;
import utils.MathUtils;

public class PninetyNinth implements IMathOperation {

	@Override
	public double execute(List<Double> list) {
		double wantedIndex = list.size() * 0.99;
		return MathUtils.isInteger(wantedIndex) ? ((list.get((int) (wantedIndex - 1)).doubleValue() + list.get((int) wantedIndex).doubleValue()) / 2) 
									  : list.get((int) (Math.ceil(wantedIndex) - 1)).doubleValue();
	}

	@Override
	public String getName() {
		return "99th Percentile";
	}

}
