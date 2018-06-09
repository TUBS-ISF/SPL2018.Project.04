package main;

import java.util.List;

import interfaces.IDataLoader;
import interfaces.IMathOperation;
import loadData.JsonLoadData;
import loader.PluginLoader;

public class Main {

	public static void main(String[] args) {
		IDataLoader dataLoader = new JsonLoadData("statsData.txt");
		List<Double> dataList = dataLoader.loadData();
		List<IMathOperation> mathOperPlugins = PluginLoader.load(IMathOperation.class);
		execute(mathOperPlugins, dataList);
	}
	
	private static void execute(List<IMathOperation> mathOperPlugins, List<Double> dataList) {
		for (IMathOperation operation : mathOperPlugins) {
			System.out.println("The " + operation.getName() + " of these data is : " + operation.execute(dataList));
		}
	}

}
