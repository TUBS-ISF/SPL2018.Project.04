import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import loadData.ManualLoad;

public aspect ManualEntry {
	//BufferedReader ManualLoad.br;
	//FileReader ManualLoad.fr;
	BufferedReader br;
	FileReader fr;
	
	 after(String path): call(ManualLoad.new(String)) && args(path) {
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			System.out.println("file doesn't exist");
			e.printStackTrace();
		}
		br = new BufferedReader(fr);	
	}
	
	List<Double> around(): execution(List<Double> ManualLoad.loadData()) {
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
