package main;
import java.io.File;
import java.util.List;

import dataLoading.JsonLoadData;
import gui.StatisticsApp;
import interfaces.IDataLoader;
import interfaces.IMathOperation;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import mathOperations.Average;
import mathOperations.Median;
import mathOperations.Percentile;
import mathOperations.StandardDeviation;

public class Main /*extends StatisticsApp implements EventHandler<ActionEvent>*/ {

	public static IDataLoader<Double> dataLoader;
	public static void main(String[] args) {
		
		//Application.launch(args);
		
		//Some Tests
		dataLoader = new JsonLoadData("statsData.txt");
		List<Double> dataList = dataLoader.loadData();
		for(double d : dataList) {
			System.out.println("the next number is : " + d);
		}
		
		
		// #if Average
		IMathOperation<Double,Double> average = new Average<Double>(dataList); 
		System.out.println("the average of these data is : " + average.execute());
		// #endif
			
		// #if Median
		IMathOperation<Double,Double> median = new Median<Double>(dataList); 
		System.out.println("the median of these data is : " + median.execute());
		// #endif
		
		// #if StandardDeviation
		IMathOperation<Double, Double> standardDeviation = new StandardDeviation<Double>(dataList);
		System.out.println("the standard deviation of these data is : " + standardDeviation.execute());
		// #endif
		
		// #if Percentile
		Percentile<Double> percentile = new Percentile<Double>(dataList);
		// #if PninetyNinth
		percentile.setPercent(0.99);
		System.out.println("the 99th percentile of these data is : " + percentile.execute());
		// #endif
		// #if PninetyFifth
		percentile.setPercent(0.95);
		System.out.println("the 95th percentile of these data is : " + percentile.execute());
		// #endif
		// #if Pninetieth
		percentile.setPercent(0.9);
		System.out.println("the 90th percentile of these data is : " + percentile.execute());
		// #endif
		// #endif
		
		

	}

	/*@Override
	public void handle(ActionEvent event)
	{
		if(event.getSource() == getOpenButton()) {
			FileChooser fileChooser = new FileChooser();
			File selectedFile = fileChooser.showOpenDialog(null);
			System.out.println("i am selecetd now");
			if(selectedFile != null) {
				dataLoader = new JsonLoadData(selectedFile.getName());
			}
			
		}
	}*/

}
