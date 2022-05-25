import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxAppearedElements {

	public static void main(String[] args) {

		// create and initialize array
		int[] A = { 2, 6, 3, 4, 5, 4, 6, 3, 5, 4, 5, 6 };

		// call method maxAppearedElement and store results in maxElements list
		ArrayList<Integer> maxElements = maxAppearedElements(A);

		// print the valuesin maxElement list
		for (Integer value : maxElements)
			System.out.print(value + " ");
		System.out.println();
	}

	/**
	 * Method that takes 
	 * @param array
	 * @return list that has those elements of array that occured most often
	 */
	public static ArrayList<Integer> maxAppearedElements(int array[]) {

		// Create map to hold key-value pairs
		Map<Integer, Integer> countMap = new LinkedHashMap<>();

		// for all values in array
		for (Integer key : array) {
			// if current value is already in map increment its occurance count
			if (countMap.containsKey(key)) {
				countMap.put(key, countMap.get(key) + 1);
			}
			// if map contain value put it in map with occurance 1
			else {
				countMap.put(key, 1);
			}
		}
		
		// to hold how many times maximum often element appeared
		int maxCount = 0;

		// for each entry in map
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			// if entry value is greater than maxCount
			if (entry.getValue() > maxCount) {
				// assign entry value to maxCount
				maxCount = entry.getValue();
			}
		}

		// Create ArrayList to return maximum often appeared elements
		ArrayList<Integer> result = new ArrayList<>();
		// for each entry in map
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			// entry value equal to maxCount add to result list
			if (entry.getValue() == maxCount) {
				result.add(entry.getKey());
			}
		}

		// return result list
		return result;
	}

}
