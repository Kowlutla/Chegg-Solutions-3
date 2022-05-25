import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MapCollection {

	// HashMap to store clothingItems
	HashMap<Integer, ClothingItem> clothingItems;

	/**
	 * i.A constructor to create empty collection
	 */
	public MapCollection() {
		clothingItems = new HashMap<>();
	}

	/**
	 * ii)A method to add A clothingItem to collection
	 */
	public void add(ClothingItem item) {
		// make id as key and ClothingItem as Value
		Integer id = item.getId();
		clothingItems.put(id, item);
	}

	/**
	 * iii)A method to seach for ClothingItem by
	 * 
	 * @param id
	 * @return ClothingItem
	 */
	public ClothingItem searchById(int id) {

		Iterator<Integer> iter = clothingItems.keySet().iterator();
		// look for all keys(id) in collection
		while (iter.hasNext()) {
			// get the current id
			int current_id = iter.next();
			// if current id equals to given id
			if (current_id == id) {
				// return the ClothingItem Object Associated with current key
				return clothingItems.get(current_id);
			}
		}

		// if ClothingItem not found in collection return null
		return null;
	}

	/**
	 * iV)Method to search and return list of ClothingItems that have
	 * 
	 * @param name
	 * @return
	 */
	public ArrayList<ClothingItem> searchByName(String name) {

		// to hold the ClothingItems which have same name with given name
		ArrayList<ClothingItem> list = new ArrayList<>();

		// iterator to iterate all over the collection
		Iterator<Integer> iter = clothingItems.keySet().iterator();
		// for all keys in collection
		while (iter.hasNext()) {
			// get current key
			int current_id = iter.next();
			// get the current value i.e ClothingItem object
			ClothingItem current_item = clothingItems.get(current_id);

			// if current ClothingItem Object name equal to given name
			if (current_item.getName().equalsIgnoreCase(name)) {
				// add current ClothingItem to list
				list.add(current_item);
			}
		}
		// return the resulted list
		return list;
	}

}
