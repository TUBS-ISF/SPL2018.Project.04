package main;
import java.util.List;

import dataLoading.JsonLoadData;
import interfaces.IDataLoader;
import interfaces.IMathOperation;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import mathOperations.Average;
import mathOperations.Median;
import mathOperations.StandardDeviation;
import properties.PropertyManager;

public class Main implements EventHandler<ActionEvent> {

	//static StatisticsApp gui;
	public static void main(String[] args) {
		/*
		gui = new StatisticsApp();
		StatisticsApp.launch(args);
		*/
		
		//Some Tests
		IDataLoader<Double> dataLoader = new JsonLoadData("statsData.txt");
		List<Double> dataList = dataLoader.loadData();
		for(double d : dataList) {
			System.out.println("the next number is : " + d);
		}
		
		
		if (PropertyManager.getProperty("Average")) {
			IMathOperation<Double,Double> average = new Average<Double>(dataList); 
			System.out.println("the average of these data is : " + average.execute());
		}
		if (PropertyManager.getProperty("Median")) {
			IMathOperation<Double,Double> median = new Median<Double>(dataList); 
			System.out.println("the median of these data is : " + median.execute());
		}
		if (PropertyManager.getProperty("StandardDeviation")) {
			IMathOperation<Double, Double> standardDeviation = new StandardDeviation<Double>(dataList);
			System.out.println("the standard deviation of these data is : " + standardDeviation.execute());
		}
		
		

	}

	@Override
	public void handle(ActionEvent event)
	{
		//if(event.getSource() == gui.open)
	}

}
