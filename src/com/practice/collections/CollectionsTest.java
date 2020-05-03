package com.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import com.practice.model.Employee;

//Ctrl+Shift+o
public class CollectionsTest {

	public static void main(String[] args) {

		// coreCollectionsTest();
		// customCollectionTest();
		// setTest();
		mapTest();
		System.out.println("Main method executed.....");
	}

	/**
	 * 
	 */
	private static void customCollectionTest() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		// Database calls

		Employee emp1 = new Employee("1", "Malla", "Ch", "abc@ct.com", "123456");
		Employee emp2 = new Employee("2", "Vinu", "Ch", "xyz@ct.com", "456789");
		Employee emp3 = new Employee("3", "Praveen", "S", "happy@ct.com", "159753");
		Employee emp4 = new Employee("4", "Kalinga", "N", "laugh@ct.com", "456852");

		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		listOfEmp.add(emp4);

		for (Employee employee : listOfEmp) {
			// System.out.println(" employee == "+employee.getfName());
			System.out.println(" employee == " + employee.toString());

		}
	}

	private static void coreCollectionsTest() {
		System.out.println("Hello collections.........");
		// ArrayList<String> aList = new ArrayList<String>();
		ArrayList<String> aList = null;
		// We might call different methods or functionalities

		if (true) {
			aList = new ArrayList<String>();
			aList.add("Praveen");
			aList.add("Vinu");
			aList.add("Malla");
			aList.add("Kalinga");
			aList.add("Praveen");
			aList.add("Vinu");
			aList.add(8, "456");
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

	private static void setTest() {

		Set<Integer> set = new HashSet<Integer>();

		set.add(99);
		set.add(99);
		set.add(99);
		set.add(49);
		set.add(44);
		set.add(4);
		set.add(new Integer(5));
		set.add(3);
		set.add(2);
		set.add(9);
		set.add(99);
		set.add(99);

		// int Integer
		System.out.println(set.add(Integer.valueOf("6")));
		System.out.println("set.size() == " + set.size());

		System.out.println("set == " + set);
		/*
		 * for (Integer string : set) { System.out.println("string val == "+string); }
		 */

	}

	private static void mapTest() {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(2, "three");

		System.out.println(map);

		System.out.println("entrySet.getKey()" + " :: " + "entrySet.getValue()");
		for (Map.Entry<Integer, String> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey() + " :: " + entrySet.getValue());
		}
	}
}
