package com.practice.collections;

public class ArrayTest {
	//Git edit demo
	//public static void main(String[] args) {
	public static void main(String[] args) {
		
		String[] strArray = new String[6];
		strArray[0] = "CMR";
		strArray[1] = "VIN";
		strArray[2] = "KAL";
		strArray[3] = "PRA";
		strArray[4] = "PRAV";
		strArray[5] = "ABC";
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println("---------------------------------------------------");
		
		for (String string : strArray) {
			System.out.println("string == "+string);
		}
	}

}
