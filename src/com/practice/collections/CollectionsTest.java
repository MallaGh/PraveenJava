package com.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//Ctrl+Shift+o
public class CollectionsTest {

	public static void main(String[] args) {
		System.out.println("Hello collections.........");
		//ArrayList<String> aList = new ArrayList<String>();
		ArrayList<String> aList = null;
		//HashSet<String> hSet = new HashSet<String>();
		HashMap<String, String> hMap = new HashMap<String, String>();
		
		String str = "";
		//We might call different methods or functionalities
		
		if(true){
			aList = new ArrayList<String>();
			aList.add("Praveen");
			aList.add("Vinu");
			aList.add("Malla");
			aList.add("Kalinga");
			aList.add("Praveen");
			aList.add("Vinu");
			aList.add("Malla");
			aList.add("Kalinga");
		}
		
		//System.out.println("aList.size() == "+aList.size());
		
		/*for (int i = 0; i < aList.size(); i++) {
			System.out.println( " i == "+i);
			System.out.println("aList.get(i)  "+aList.get(i));
			System.out.println("-----------------------------------");
		}*/
		
		
		for (String listValue : aList) {
			System.out.println("listValue = " +listValue);
		}
	}

}
