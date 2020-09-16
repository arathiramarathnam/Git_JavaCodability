package com.javacodability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class StudentInfo implements Comparable<StudentInfo>{
	
	String studentname;
	int regno;
	int marks;
	
	StudentInfo(int regno, String studentname, int marks){
		this.regno=regno;
		this.studentname=studentname;
		this.marks=marks;
	}
	
	@Override
	public int compareTo(StudentInfo o) {
		
		return o.marks-this.marks;
	}
}

public class Program2_StudentAwards {
	

	public static void main(String[] args) {
		List<StudentInfo> list=new ArrayList<StudentInfo>();
		list.add(new StudentInfo(134151,"aaaaaa", 436));
		list.add(new StudentInfo(134152,"bbbbbb", 437));
		list.add(new StudentInfo(134153,"cccccc", 438));
		list.add(new StudentInfo(134154,"dddddd", 439));
		list.add(new StudentInfo(134155,"eeeeee", 440));
	
		Collections.sort(list);
		System.out.println("RegNo" +"<========>"+" Name "+"<======>"+"Marks ");
		
		Iterator<StudentInfo> it =list.iterator();
		while (it.hasNext()) {
		StudentInfo aftersort = (StudentInfo) it.next();
		System.out.println(aftersort.regno+"=========="+aftersort.studentname+"========"+aftersort.marks);
		}
	
		@SuppressWarnings("unchecked")
		List<StudentInfo> sublist=list.subList(0, 3);
		
		System.out.println("Student ranked 1st, 2nd, 3rd based on marks");
		Iterator<StudentInfo> it1 =sublist.iterator();
		for (Iterator<StudentInfo> iterator = sublist.iterator(); iterator.hasNext();) {
			StudentInfo rank = (StudentInfo) iterator.next();
			System.out.println(rank.regno+"=========="+rank.studentname+"========"+rank.marks);
		}
}
}
