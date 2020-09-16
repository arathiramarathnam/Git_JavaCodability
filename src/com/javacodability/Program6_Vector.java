package com.javacodability;

import java.util.Vector;

public class Program6_Vector {

	public static void main(String[] args) {
		String N="Z";
		int n =5;
		char[] chars=N.toCharArray();
		@SuppressWarnings({ "unused", "rawtypes" })
		Vector<String>vector = new Vector<String>();
		vector.add("t");
		vector.add("e");
		vector.add("k");
		vector.add("a");
		vector.add("r");
		vector.add("c");
		vector.add("h");
		for (int i = 3; i < 8; i++) {
			vector.insertElementAt(N, i);
		}
		
		System.out.println(vector);
			
	String [] array=vector.toArray(new String[vector.size()]);
	System.out.println(array.length);
	
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i].toString());
		}
		System.out.println();
		System.out.println(vector.size());
		for (int i = 6; i < vector.size()-1; i++) {
			vector.remove(i);
			}
		System.out.println(vector);
		
		String [] array1=vector.toArray(new String[vector.size()]);
			
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]);
		}
		}

}
