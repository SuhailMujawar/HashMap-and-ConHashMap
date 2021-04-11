package com.sam.Demoproj;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;
//import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapIteration {
	public static void main(String[] args) {
		Map<Integer, String>
	    cchm = new ConcurrentHashMap<Integer, String>();
		
		cchm.put(1, "Apple");
		cchm.put(2, "Samsung");
		cchm.put(3, "Motorola");
		IteratorSetMap(cchm);
	}

	private static void IteratorSetMap(Map<Integer, String> cchm) {
       Iterator<Map.Entry<Integer, String>> it = cchm.entrySet().iterator();
       while(it.hasNext()) {
    	   Map.Entry<Integer, String> it1 = it.next();
    	   cchm.put(4, "Redmi");
    	   cchm.put(5, "Oppo");
    	   System.out.println("Key ="+it1.getKey());
    	   System.out.println(" ");
    	   System.out.println("Value ="+it1.getValue());
       }
	}
	}

	//ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
	
