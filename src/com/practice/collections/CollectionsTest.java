package com.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import com.practice.model.Employee;

//Ctrl+Shift+o
public class CollectionsTest {

	public static void main(String[] args) {
		// coreCollectionsTest();
		customCollectionTest();
		System.out.println("Main method executed.....");
	}
	
	/**
	 * 
	 */
	private static void customCollectionTest() {
		ArrayList<Employee>  listOfEmp = new ArrayList<Employee>();
		Employee emp1 = new Employee("1", "Malla", "Ch", "abc@ct.com", "123456");
		Employee emp2 = new Employee("2", "Vinu", "Ch", "xyz@ct.com", "456789");
		Employee emp3 = new Employee("3", "Praveen", "S", "happy@ct.com", "159753");
		Employee emp4 = new Employee("4", "Kalinga", "N", "laugh@ct.com", "456852");
		
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);
		
		for (Employee employee : listOfEmp) {
			//System.out.println(" employee == "+employee.getfName());
			System.out.println(" employee == "+employee.toString());
		}
	}

	private static void coreCollectionsTest() {
		System.out.println("Hello collections.........");
		// ArrayList<String> aList = new ArrayList<String>();
		ArrayList<String> aList = null;
		// HashSet<String> hSet = new HashSet<String>();
		HashMap<String, String> hMap = new HashMap<String, String>();

		String str = "";
		// We might call different methods or functionalities

		if (true) {
			aList = new ArrayList<String>();
			aList.add("Praveen");
			aList.add("Vinu");
			aList.add("Malla");
			aList.add("Kalinga");
			aList.add("Praveen");
			aList.add("Vinu");
			aList.add(8,"456");
			aList.add("Malla");
			aList.add("Kalinga");
		}

		// System.out.println("aList.size() == "+aList.size());

		/*
		 * for (int i = 0; i < aList.size(); i++) { System.out.println( " i == "+i);
		 * System.out.println("aList.get(i)  "+aList.get(i));
		 * System.out.println("-----------------------------------"); }
		 */
		
		for (String string : aList) {
			System.out.println("string = " + string);
		}
		
		System.out.println("---------------------------------------");
		Vector<String> vList = new Vector<String>();
		vList.addAll(aList);

		for (String vlValue : vList) {
			System.out.println("vlValue === " + vlValue);
		}
	}

}
