package com.javacodability;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Employee {
	
	String empname;
	
	
	Employee(String empname){
		this.empname=empname;
		}
	
}


public class Program8_EmployeeInfo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("b");
		list.add("c");
		System.out.println("ArrayList with duplicates: "+list.size());
		
		/*for (int i = 0; i < list.size(); i++) {
		for (int j = i+1; j < list.size(); j++) {
			if (list.get(i).equals(list.get(j))) {
				list.remove(j);
				j--;
			}
		}
	}*/
		
		Set<String> set = new  LinkedHashSet<String>(list);
		list.clear();
		list.addAll(set);
		
		System.out.println("ArrayList after removing duplicates duplicates: "+list.size());
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			String emp = (String) it.next();
			System.out.println(emp);
		}

}
}
