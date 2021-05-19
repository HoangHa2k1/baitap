package Baitap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		//init LinkedHashMap
		java.util.LinkedHashMap<Integer,String> LinkedHashMap =new LinkedHashMap <Integer ,String>();
		//add elements to LinkedHashMap
		LinkedHashMap.put(1,"Java");
		LinkedHashMap.put(2,"PHP");
		LinkedHashMap.put(3,"C++");
		LinkedHashMap.put(4,"Python");
		//show LinkedHashMap before remove
		System.out.println("before remove");
		Show(LinkedHashMap);
		//remove element
		LinkedHashMap.remove(2);
		//show LinkedHashMap after remove
		System.out.println("After remove");
		//show hashMap
		Show(LinkedHashMap);
	}
	//show HashMap

	private static void Show(LinkedHashMap<Integer, String> linkedHashMap) {
		Set<Integer> keySet =linkedHashMap.keySet();
		for (Integer key : keySet) {
			System.out.println(key +" "+linkedHashMap.get(key));
		
	}
	
		
	}

}
