package com.sam.Demoproj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

	public class HashMapIteration {

	    public static void main(String[] args) {        
	        Map<Integer,String> items = new HashMap<>();
	        items.put(1, "coins");
	        items.put(2, "coins");
	        items.put(5, "coins");
	        IteratorMap(items);
	       // EntryMapSet(items);
	    }

		private static void EntryMapSet(Map<Integer, String> items) {

			for (Map.Entry<Integer, String> entry : items.entrySet()) {
				System.out.println("Key=" +entry.getKey());
				System.out.println("Value="+entry.getValue());
				System.out.println(" ");
				
			}
		}

		private static void IteratorMap(Map<Integer,String> items) {
			Iterator<Map.Entry<Integer,String>> iterator=items.entrySet().iterator();
			while(iterator.hasNext()) {
				Map.Entry<Integer,String> entry = iterator.next();
			    items.put(6, "Coins");
				System.out.print("Key="+entry.getKey());
				System.out.print(",");
				System.out.print("Value="+entry.getValue());
			}
			
		}
	}

