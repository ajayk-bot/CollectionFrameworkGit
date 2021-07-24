package map_methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemoWithWrappers {

	// display the map

	public void printMap(Map<Integer, String> map) {
		System.out.println(map);
	}

	public static void main(String[] args) {

		MapDemoWithWrappers mapObj = new MapDemoWithWrappers();

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "T1");
		hashMap.put(4, "T4");
		hashMap.put(3, "T3");
		hashMap.put(2, "T2");
		mapObj.printMap(hashMap);

		// HashMap  by Keys
		//https://javadiscover.blogspot.com/2013/03/using-keyset-entryset-and-values.html
		Set<Integer> key_set = hashMap.keySet();
		System.out.println(key_set);
		// HashMap  by values
		Collection<String> map_values = hashMap.values();
		System.out.println(map_values);
		// HashMap  by entryset
		Set<Entry<Integer, String>> entries =  hashMap.entrySet();
		System.out.println(entries);
	
	
		
		
	}

}
