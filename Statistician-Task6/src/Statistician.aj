import java.util.List;

import interfaces.IDataLoader;
import loadData.ManualLoad;

public aspect Statistician {

	after(String[] argus): execution(void Main.main(String[])) && args(argus) {
		if (argus.length < 1) {
			throw new IllegalArgumentException("Missing input file");
		}
		final String path = argus[0];
		IDataLoader dataLoader = new ManualLoad(path);
		List<Double> dataList = dataLoader.loadData();
		new Statistics().execute(dataList);
	}
}
