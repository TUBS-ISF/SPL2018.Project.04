import java.util.List;

import interfaces.IDataLoader;
import loadData.JsonLoadData;

public class Main {

	public static void main(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException("Missing input file");
		}
		final String path = args[0];
		IDataLoader dataLoader = new JsonLoadData(path);
		List<Double> dataList = dataLoader.loadData();
		new Statistics().execute(dataList);
	}
}
