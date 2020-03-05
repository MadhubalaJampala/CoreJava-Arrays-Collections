package org.perscholas.collections;

import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		print(map);
		map.put("vishal",10);
		map.put("sachin",30);
		map.put("vaibhav", 20);
		System.out.println("Size of map is "+map.size());
		System.out.println(map);
		//map.clear();
		print(map);
		System.out.println(map);
		
//		if(map.containsKey("vishal")) {
//			Integer a = map.get("vishal");
//			System.out.println("Value for key \"Vishal\" is:"+a);
//		}
//		print(map);
////		map.clear();
////		print(map);
//		for(Integer i:map.values())
//			System.out.println(i);
//		for(String key:map.keySet())
//			System.out.println(key);
//		//for(map.Entry)
//		map.forEach((keys,values) -> {
//			System.out.println(keys+"="+values);
//		});
	}

	public static void print(HashMap<String,Integer> map2) {
		if(map2.isEmpty())
			System.out.println("Map is empty");
		else
			System.out.println(map2);
		map2.put("hhhh",4444);
		map2.remove("vishal");
		}
}


