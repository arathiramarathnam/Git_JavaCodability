package com.javacodability;

import java.util.ArrayList;
import java.util.Iterator;

class StudentInformation implements Comparable<StudentInformation>{
	
	String studentname;
	int regno;
	int marks;
	
	StudentInformation(int regno, String studentname, int marks){
		this.regno=regno;
		this.studentname=studentname;
		this.marks=marks;
	}
	
	@Override
	public int compareTo(StudentInformation o) {
		
		return o.marks-this.marks;
	}
}

public class Program7_StudentInfo {

	public static void main(String[] args) {
		ArrayList<StudentInformation> list=new ArrayList<StudentInformation>();
		list.add(new StudentInformation(134155,"aaaaaa", 436));
		list.add(new StudentInformation(134154,"bbbbbb", 437));
		list.add(new StudentInformation(134153,"cccccc", 438));
		list.add(new StudentInformation(134152,"dddddd", 439));
		list.add(new StudentInformation(134151,"eeeeee", 440));
		list.add(new StudentInformation(134150,"ffffff", 441));
				
		System.out.println("size of ArrayList after adding and before removing: "+list.size());
	
		Iterator<StudentInformation> it=list.iterator();
		while (it.hasNext()) {
			StudentInformation studentInformation = (StudentInformation) it.next();
			System.out.println(studentInformation.regno+"======"+studentInformation.studentname+"======"+studentInformation.marks);
			
		}
		
		list.remove(3);

		System.out.println("size of ArrayList after removing: "+list.size());
		
		Iterator<StudentInformation> it1=list.iterator();
		while (it1.hasNext()) {
			StudentInformation studentInformation = (StudentInformation) it1.next();
			System.out.println(studentInformation.regno+"======"+studentInformation.studentname+"======"+studentInformation.marks);
			
		}
	}

}
