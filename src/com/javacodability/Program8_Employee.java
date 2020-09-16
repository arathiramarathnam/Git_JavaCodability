package com.javacodability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class EmployeeInfo implements Comparable<EmployeeInfo>{
	
	String empname;
	float salary;
	
	EmployeeInfo(String empname, float salary){
		this.empname=empname;
		this.salary=salary;
	}
	
	@Override
	public int compareTo(EmployeeInfo o) {
		return this.empname.compareTo(o.empname);
	}
}


public class Program8_Employee {

	public static void main(String[] args) {
		ArrayList<EmployeeInfo> list=new ArrayList<EmployeeInfo>();
		list.add(new EmployeeInfo("a", 436760.98F));
		list.add(new EmployeeInfo("b", 437870.99F));
		list.add(new EmployeeInfo("c", 438890.96F));
		list.add(new EmployeeInfo("d", 439980.98F));
		list.add(new EmployeeInfo("e", 440570.99F));
		list.add(new EmployeeInfo("b", 437870.99F));
		list.add(new EmployeeInfo("c", 438890.96F));
		list.add(new EmployeeInfo("d", 439980.98F));
		list.add(new EmployeeInfo("e", 440570.99F));
				
		System.out.println("ArrayList with duplicates: "+list.size());
	
		Iterator<EmployeeInfo> it=list.iterator();
		while (it.hasNext()) {
			EmployeeInfo emp = (EmployeeInfo) it.next();
			System.out.println(emp.empname+"     "+emp.salary);
		}
		
		/*Set<EmployeeInfo> set = new  LinkedHashSet<EmployeeInfo>(list);
		list.clear();
		list.addAll(set);*/
		
		/*for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
					}
			}
		}*/
		
		
		ArrayList<EmployeeInfo> newList=new ArrayList<EmployeeInfo>();
		for (EmployeeInfo ele : list) {
			if (!newList.contains(ele)) {
				newList.add(ele);
			}
		}
		
		System.out.println("ArrayList after removing duplicates: "+newList.size());
		Iterator<EmployeeInfo> it1=newList.iterator();
		while (it1.hasNext()) {
			EmployeeInfo emp = (EmployeeInfo) it1.next();
			System.out.println(emp.empname+"   "+emp.salary);
		}
		
	}

}
