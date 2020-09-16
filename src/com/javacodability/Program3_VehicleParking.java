package com.javacodability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class VehicleInfo implements Comparable<VehicleInfo>{
	
	String vehiclemodel;
	int vehicleno;
	int parkedhour;
	
	VehicleInfo(int vehicleno, String vehiclemodel, int parkedhour){
		this.vehicleno=vehicleno;
		this.vehiclemodel=vehiclemodel;
		this.parkedhour=parkedhour;
	}
	
	@Override
	public int compareTo(VehicleInfo o) {
		
		return o.parkedhour-this.parkedhour;
	}
}

public class Program3_VehicleParking {

	public static void main(String[] args) {
		
		List<VehicleInfo> list1=new ArrayList<VehicleInfo>();
		List<VehicleInfo> list2=new ArrayList<VehicleInfo>();
		
		list1.add(new VehicleInfo(2500, "Honda Odyssey", 60));
		list1.add(new VehicleInfo(2501, "Honda Accord", 120));
		list2.add(new VehicleInfo(2502, "Honda Pilot", 140));
		list2.add(new VehicleInfo(2503, "Honda Civic", 180));
		
		List<VehicleInfo> mergelist=new ArrayList<VehicleInfo>(list1);
		mergelist.addAll(list2);
		
		Collections.sort(mergelist);
		System.out.println("Returns Vehicle list with highest parked hour info");
		 Iterator<VehicleInfo> it = mergelist.iterator();
	      while (it.hasNext()){
	    	  VehicleInfo parkedhourlist = (VehicleInfo) it.next();
	    	  System.out.println(parkedhourlist.vehicleno+"========="+parkedhourlist.vehiclemodel+"======"+parkedhourlist.parkedhour);
	    	  break;
	      }

	}
}
