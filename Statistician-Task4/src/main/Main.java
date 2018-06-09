package main;

import java.util.List;

import interfaces.IDataLoader;
import interfaces.IMathOperation;
import loadData.JsonLoadData;
import loader.PluginLoader;

public class Main {

	public static void main(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException("Missing input file");
		}
		final String path = args[0];
		IDataLoader dataLoader = new JsonLoadData(path);
		List<Double> dataList = dataLoader.loadData();
		List<IMathOperation> operations = PluginLoader.load(IMathOperation.class);
		execute(operations, dataList);
	}
	
	private static void execute(List<IMathOperation> operations, List<Double> dataList) {
		for (IMathOperation operation : operations) {
			System.out.println("The " + operation.getName() + " of these data is : " + operation.execute(dataList));
		}
	}

}
