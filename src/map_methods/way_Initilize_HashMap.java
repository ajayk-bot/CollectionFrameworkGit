package map_methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class way_Initilize_HashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "T1");
		map1.put(44, "T4");
		map1.put(24, "T3");
		map1.put(3343, "T2");
		System.out.println(map1);

		// HashMap(int initialCapacity)
		/** copy HashMap to another HashMap using the HashMap constructor **/
		HashMap<Integer, String> map2 = new HashMap<Integer, String>(3);
		map2.put(1, "I3");
		map2.put(3, "I4");
		map2.put(2, "I5");
		System.out.println(map2);

		// HashMap(Map map)
		// Creating a new map from above map
		HashMap<Integer, String> newMapUsingAboveMap1 = new HashMap<Integer, String>(map1);
		System.out.println(newMapUsingAboveMap1);

		HashMap<String, Integer> hashMapprac = new HashMap<String, Integer>();
		hashMapprac.put("A", 433);
		hashMapprac.put("L", 45334);
		hashMapprac.put("D", 3);
		hashMapprac.put("Z", 6);

		System.out.println(hashMapprac);

		// -------------------------------------------------------------------------
		/** How to copy TreeMap to HashMap using the HashMap constructor? **/
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("B", 4633);
		treeMap.put("O", 4);
		treeMap.put("K", 365);
		treeMap.put("L", 61);
		HashMap<String, Integer> HM = new HashMap<String, Integer>(treeMap);
		System.out.println(HM);
		// -------------------------------------------------------------------------

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		System.out.println(hmap.put(1, "One"));
		System.out.println(hmap.put(2, "Two"));
		System.out.println(hmap.put(1, "NewOne"));
		System.out.println("HashMap contains: " + hmap);
		hmap.put(null, "testing1");
		hmap.put(3, "testing1");
		hmap.put(4, "testing4");
		hmap.put(3, "testingUpdated");
		// hmap.put(null, null);
		System.out.println("HashMap contains: " + hmap);
		System.out.println("HashMap size is: " + hmap.size());
		System.out.println("HashMap is empty: " + hmap.isEmpty());

		/** How to get all the keys of HashMap using the keySet method? **/
		System.out.println("--------------" + map1);
		Set<Integer> keySet = map1.keySet();
		for (Integer intKey : keySet) {
			System.out.println(intKey);
		}

		/** How to get all values of HashMap using the values method? **/
		System.out.println("--------------" + map1);
		Collection<String> valueInMap = map1.values();
		for (String StrValue : valueInMap) {
			System.out.println(StrValue);
		}

		/**
		 * How to get all mappings (entries) of HashMap using the entrySet method?
		 **/
		/**
		 * The entrySet method of the Java HashMap class returns a set view of entries
		 * i.e. key-value pairs contained in this hashmap object. The entry set returned
		 * by this method is backed by the original map object, so if you make any
		 * changes to the entry set it will reflect in the map, and vice versa.
		 **/
		System.out.println("--------------" + map1);
		Set<Map.Entry<Integer, String>> entries = map1.entrySet();

		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println("Key -> " + entry.getKey() + " Value->" + entry.getValue());
		}

		for (Entry<Integer, String> entry : map1.entrySet()) {
			System.out.println("Key -> " + entry.getKey() + " Value->" + entry.getValue());
		}

		/**
		 * java.util.HashMap.entrySet() Method: The method returns a set having same
		 * elements as the hash map.
		 **/
		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + map1);
		// Using entrySet() to get the set view
		System.out.println("The set is: " + map1.entrySet());

	}

}
