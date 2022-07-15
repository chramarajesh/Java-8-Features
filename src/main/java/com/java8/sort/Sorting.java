package com.java8.sort;

import java.util.ArrayList;
import java.util.List;
	
/**
 * @author Rajesh.Chittavarjula
 * 
 */
public class Sorting {

	public static void main(String[] args) {
//==========================Without Java 8===========================================
		/*
		 * List<String> listNeedToSort = new ArrayList<String>();
		 * listNeedToSort.add("Java"); listNeedToSort.add("C#");
		 * listNeedToSort.add("PHP");
		 * 
		 * Collections.sort(listNeedToSort, new Comparator<String>() {
		 * 
		 * @Override public int compare(String listNeedToSort1, String listNeedToSort2)
		 * { return listNeedToSort1.compareTo(listNeedToSort2); } });
		 * System.out.println("Sorted List: " + listNeedToSort);
		 * 
		 * String[] arrayNeedToSort=new String[] {"Health","Entertainment","Social"};
		 * 
		 * 
		 * Collections.sort(Arrays.asList(arrayNeedToSort), new Comparator<String>() {
		 * 
		 * @Override public int compare(String arrayNeedToSort1, String
		 * arrayNeedToSort2) { return arrayNeedToSort1.compareTo(arrayNeedToSort2); }
		 * }); System.out.println("Sorted List: " + Arrays.asList(arrayNeedToSort));
		 */

		// ==========================Without Java
		// 8===========================================
		// ==========================With Java
		// 8==============================================

		List<String> listNeedToSort = new ArrayList<String>();
		listNeedToSort.add("Java");
		listNeedToSort.add("C#");
		listNeedToSort.add("PHP");
		//Collections.sort(listNeedToSort, (String a, String b) -> a.compareTo(b));
		listNeedToSort.sort((String a,String b)->a.compareTo(b));
		System.out.println("Sorted List: " + listNeedToSort);
	}
}
