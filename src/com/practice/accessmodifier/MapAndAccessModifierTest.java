package com.practice.accessmodifier;

import java.util.HashMap;

import com.practice.collections.Key;

//Driver class
public class MapAndAccessModifierTest {
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new Key("vishal"), 20);
		map.put(new Key("vishal"), 25);
		map.put(new Key("sachin"), 30);
		map.put(new Key("sai"), 35);
		map.put(new Key("vaibhav"), 40);

		System.out.println();
		System.out.println("Value for key sachin: " + map.get(new Key("sachin")));
		System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav")));
		System.out.println("Value for key vaibhav: " + map.get(new Key("vishal")));
	}
}