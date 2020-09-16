package com.javacodability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortStringsAlphabetically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("USA");
		   listofcountries.add("India");
		   listofcountries.add("Europe");
		   listofcountries.add("Australia");
		   listofcountries.add("usa");
		   listofcountries.add("india");
		   listofcountries.add("europe");
		   listofcountries.add("australia");

		   /*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String alphabeticalsort: listofcountries){
				System.out.println(alphabeticalsort);
			}
		   //double colon (::) operator, also known as method reference operator in Java, 
		   //is used to call a method by referring to it with the help of its class directly. 
		   //They behave exactly as the lambda expressions
		  
		  listofcountries.sort(String::compareToIgnoreCase);
		   // Collections.sort(listofcountries, String.CASE_INSENSITIVE_ORDER);
		   Collections.sort(listofcountries, java.text.Collator.getInstance());

		   /* Sort statement*/
		   	   
		   /*Collections.sort(listofcountries, new Comparator<String>() {
			    @Override
			    public int compare(String s1, String s2) {
			        return s1.compareToIgnoreCase(s2);
			    }
			});*/


		   /* Sorted List*/
		   System.out.println("After Sorting:");
		   for(String alphabeticalsort: listofcountries){
				System.out.println(alphabeticalsort);
			}

	}

}
