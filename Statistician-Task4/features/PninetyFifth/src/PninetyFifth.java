import java.util.List;

import interfaces.IMathOperation;
import utils.MathUtils;

public class PninetyFifth implements IMathOperation {

	@Override
	public double execute(List<Double> list) {
		double wantedIndex = list.size() * 0.95;
		return MathUtils.isInteger(wantedIndex) ? ((list.get((int) (wantedIndex - 1)).doubleValue() + list.get((int) wantedIndex).doubleValue()) / 2) 
									  : list.get((int) (Math.ceil(wantedIndex) - 1)).doubleValue();
	}

	@Override
	public String getName() {
		return "95th Percentile";
	}

}
