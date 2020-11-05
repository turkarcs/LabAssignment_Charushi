package Lab_6;
/*
 * @author:Charushi
 * Date:05-11-2020
 * desc:Create a method which accepts a hash map and
   return the values of the map in sorted order as a List.
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSorted {
	public static void main(String[] args) {
		HashMap <Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "Charu");
		hashMap.put(2, "Shivani");
		hashMap.put(3, "Tina");
		hashMap.put(4, "Shiva");
		List<String> sortedHashMap=new ArrayList<String>();
		sortedHashMap=getValues(hashMap);
		System.out.println(sortedHashMap);
		
		
	}

	private static List<String> getValues(HashMap<Integer, String> hashMap) {
		
		List<String> sortedHashMap=new ArrayList<String>();
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());
		}
		Collections.sort(sortedHashMap);
		
		return sortedHashMap;
	}

}

