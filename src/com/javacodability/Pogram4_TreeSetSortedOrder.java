package com.javacodability;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Pogram4_TreeSetSortedOrder {

	public static void main(String[] args) throws Exception{
		Set<Integer>  ts = new TreeSet<Integer>();
		ts.add(16040);
		ts.add(16039);
		ts.add(16038);
		ts.add(16037);
		ts.add(16036);
		
		Iterator<Integer> it =ts.iterator();
		while (it.hasNext()) {
		Integer setorder = (Integer) it.next();
		System.out.println(setorder);
		ts.add(16036);
		if (setorder.equals(16036)) {
				throw new ConcurrentModificationException("Error exists: user trying to add duplicates");
		}
		}
}
}


