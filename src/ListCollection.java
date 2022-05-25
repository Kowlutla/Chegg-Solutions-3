import java.util.ArrayList;

public class ListCollection {

	// ArrayList to store clothingItems
	ArrayList<ClothingItem> clothingItems;

	/**
	 * i.A constructor to create empty collection
	 */
	public ListCollection() {
		clothingItems = new ArrayList<>();
	}

	/**
	 * ii)A method to add A clothingItem to collection
	 */
	public void add(ClothingItem item) {
		clothingItems.add(item);
	}

	/**
	 * iii)A method to seach for ClothingItem by
	 * 
	 * @param id
	 * @return ClothingItem
	 */
	public ClothingItem searchById(int id) {
		// for all ClothingItems in collection
		for (int i = 0; i < clothingItems.size(); i++) {
			// get the current ClothingItem
			ClothingItem current = clothingItems.get(i);
			// if current item id is same as given id
			if (current.getId() == id) {
				// return current ClothingItem
				return current;
			}
		}

		// if ClothingItem not found in collection return null
		return null;
	}

	public ArrayList<ClothingItem> searchByName(String name) {
		ArrayList<ClothingItem> list = new ArrayList<>();
		// for all ClothingItems in collection
		for (int i = 0; i < clothingItems.size(); i++) {
			// get the current ClothingItem
			ClothingItem current = clothingItems.get(i);
			// if current item name is same as given name
			if (current.getName().equalsIgnoreCase(name)) {
				// add current item to list
				list.add(current);
			}
		}
		// return the resulted list
		return list;
	}

}
