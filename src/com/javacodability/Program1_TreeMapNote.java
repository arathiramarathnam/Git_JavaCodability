package com.javacodability;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Student implements Comparable<Student>{
	
	String studentname;
	int regno;
	
	Student(int regno, String studentname){
		this.regno=regno;
		this.studentname=studentname;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.regno-o.regno;
	}
}

public class Program1_TreeMapNote {
	
	public static <studentname, regno> void main(String[] args) {
			
		TreeMap<Integer, String>  tm = new TreeMap<Integer, String>();
		tm.put(16040, "aaaaa");
		tm.put(16039, "bbbbb");
		tm.put(16038, "ccccc");
		tm.put(16037, "ddddd");
		tm.put(16036, "eeeee");
		
		Set<Entry<Integer,String>> entries=tm.entrySet();
		
		for(Entry<Integer, String> key : entries){
			
			Integer regno=key.getKey();
			String studentname=key.getValue();
			System.out.println("Registration number: "+regno+"------>"+"Student name: "+studentname);
			
		}
	}
}


