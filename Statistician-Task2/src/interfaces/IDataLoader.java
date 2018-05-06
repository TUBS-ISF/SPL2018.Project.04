package interfaces;

import java.util.List;

public interface IDataLoader<N extends Number> {
	/**
	 * loads the data 
	 * @return sorted Data list
	 */
	public List<N> loadData();
}
