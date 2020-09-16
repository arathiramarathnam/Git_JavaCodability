package com.javacodability;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class PriorityStudent {
	public String name; 
    public int id;
    
    public PriorityStudent(String name, int id) { 
        
        this.name = name; 
        this.id = id; 
    } 
    
    public int getId() { 
        return id; 
    }
}
class StudentComparator implements Comparator<PriorityStudent>{
	@Override
	public int compare(PriorityStudent s1, PriorityStudent s2) {
		//minimum priority queue: ascending order of id
            if (s1.id > s2.id) 
                return 1; 
            else if (s1.id < s2.id) 
                return -1; 
                            return 0; 
          }  

}
public class Program15_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<PriorityStudent> pq=new PriorityQueue<PriorityStudent>(5, new StudentComparator());
		pq.add(new PriorityStudent("aaaaa", 4));
		pq.add(new PriorityStudent("bbbbb", 0));
		pq.add(new PriorityStudent("ccccc", 2));
		pq.add(new PriorityStudent("ddddd", 3));
		pq.add(new PriorityStudent("eeeee", 1));
		
		Iterator<PriorityStudent> it = pq.iterator();
		while (it.hasNext()) {
			PriorityStudent minpriorityQ = (PriorityStudent) it.next();
			System.out.println(minpriorityQ.getId());
		}
		
		System.out.println("initial queue topelement: "+pq.peek().getId()); 
		while (!pq.isEmpty()) { 
            System.out.println("poll the top element: "+pq.poll().getId()); 
            break;
            }
		
		System.out.println("after removal top element: "+pq.peek().getId());

	}

}
