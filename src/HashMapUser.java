import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapUser {

	public static void main(String[] args) {

		// Create instance
		String initialSet[] = { "Romeo", "Juliet", "Adam", "Eve", "Homer", "Marge", "Bart", "Eve" };

		// Create HashMap (may use library version)
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		// initial set should be the key and value should
		// be the hashcode of the string (Use the default hashCode() method)
		for (String str : initialSet) {

			int hashCode = str.hashCode();
			hashMap.put(str, hashCode);
		}

		// Then print the contents of Map
		Iterator<Map.Entry<String, Integer>> iter = hashMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print("Key: " + key + ",");
			System.out.println(" Value: " + value);
		}

	}

}
