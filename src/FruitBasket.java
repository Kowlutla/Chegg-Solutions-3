import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//to iterate over the objects it must be iterable 
class FruitBasket implements Iterable<Fruit> {
	private List<Fruit> items;

	public FruitBasket() {
		items = new ArrayList<Fruit>();
	}

	public void add(Fruit f) {
		items.add(f);
	}

	public String toString() {
		return items.toString();
	}

	// define it here
	/**
	 * Define the inner member class named BasketIterator which implements the
	 * Iterator<Fruit>
	 */
	class BasketIterator implements Iterator<Fruit> {
		// A private int data field named nextIndex that defines the next index in the
		// iterator.
		private int nextIndex = 0;

		/**
		 * A method named hasNext() which returns true 
		 * if the iteration has more elements, and false otherwise.
		 */
		@Override
		public boolean hasNext() {
			if (nextIndex < items.size()) {
				return true;
			}
			return false;
		}

		/**
		 * A method named next() which returns 
		 * the next element (Fruit) in the iteration.
		 */
		@Override
		public Fruit next() {
			return items.get(nextIndex++);
		}

	}

	//return Iterator
	@Override
	public Iterator<Fruit> iterator() {
		return new BasketIterator();
	}
}