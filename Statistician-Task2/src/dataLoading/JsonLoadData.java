package dataLoading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.IDataLoader;

public class JsonLoadData implements IDataLoader<Double> {
	
	BufferedReader br;
	FileReader fr;
	
	public JsonLoadData(String path) {
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			System.out.println("file doesn't exist");
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		}
	
	@Override
	//ToDo change this method later to read JSON format
	public List<Double> loadData() {
		List<Double> dataList = new ArrayList<Double>();
		String line = null;
		try {
			while((line = br.readLine()) != null) {
				try {
					dataList.add(Double.parseDouble(line));
				} catch(NumberFormatException nfe) {
					//doNothing
				}	
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(dataList);
		return dataList;
	}
}
