import java.util.List;

import dataLoading.JsonLoadData;
import interfaces.IDataLoader;
import interfaces.IMathOperation;
import mathOperations.Average;
import mathOperations.Median;

public class Main {

	public static void main(String[] args) {
		
		//Some Tests
		IDataLoader<Double> dataLoader = new JsonLoadData("statsData.txt");
		List<Double> dataList = dataLoader.loadData();
		for(double d : dataList) {
			System.out.println("the next number is : " + d);
		}
		IMathOperation<Double,Double> average = new Average<Double>(dataList); 
		System.out.println("the average of these data is : " + average.execute());
		IMathOperation<Double,Double> median = new Median<Double>(dataList); 
		System.out.println("the median of these data is : " + median.execute());

	}

}
