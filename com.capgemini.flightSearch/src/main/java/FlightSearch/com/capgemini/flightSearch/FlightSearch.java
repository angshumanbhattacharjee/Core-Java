package FlightSearch.com.capgemini.flightSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class FlightSearch {
	
	
	public static void main(String[] args) {
		
		MyInteger num1= new MyInteger(1);
		MyInteger num2= new MyInteger(2);
		MyInteger num3= new MyInteger(3);
		MyInteger num4= new MyInteger(4);
		MyInteger num5= new MyInteger(5);
		
		
		HashMap<MyInteger, String> tree1= new HashMap<MyInteger, String>();
		
		tree1.put(num1,"angshu");
		tree1.put(num2,"vikas");
		tree1.put(num3,"vimal");
		tree1.put(num4,"kabir");
		tree1.put(num5,"aasim");
		
		System.out.println(tree1.toString());
		
		System.out.println("===========================");
		
		System.out.println(tree1.size());
		
		tree1.clear();
		
		System.out.println("===========================");
				
		System.out.println(tree1.toString());
		
		System.out.println("===========================");
		
		MyInteger num35= new MyInteger(35);
		
		MyInteger num14= new MyInteger(14);
		
		tree1.put(num1,"angshuman");
		tree1.put(num2,"vikas Kumar");
		tree1.put(num35,"vimal sharma");
		tree1.put(num14,"kabir khan");
		tree1.put(num5,"aasim anwar");
		
		
		for(HashMap.Entry map: tree1.entrySet()) {
			System.out.println(map.getKey()+"   "+map.getValue());
		}
	
		System.out.println("===========================");
		
		for(HashMap.Entry map: tree1.entrySet()) {
			System.out.println(map.getKey());
		}
		
		System.out.println("===========================");
		
		for(HashMap.Entry map: tree1.entrySet()) {
			System.out.println(map.getValue());
		}
		
		System.out.println("===========================");
		
		TreeMap<MyInteger, String> sorted = new TreeMap<MyInteger, String>(tree1);
		
		for(Entry<MyInteger, String> map1: sorted.entrySet()) {
			System.out.println(map1.getKey()+"   "+map1.getValue());
		}
//		
//		System.out.println(tree.toString());
//		
//		System.out.println(tree.ceiling(5));
		
		System.out.println("===========================");
		
		
		List<HashMap.Entry<MyInteger, String> > list = new ArrayList<HashMap.Entry<MyInteger, String> >(tree1.entrySet()); 
		
		Collections.sort(list, new Comparator<HashMap.Entry<MyInteger, String>>() { 

			public int compare(Entry<MyInteger, String> o1, Entry<MyInteger, String> o2) {
				// TODO Auto-generated method stub
				return (o1.getValue()).compareTo(o2.getValue());
			} 
        }); 
		
		
		
		for(Entry<MyInteger, String> i : list) {
			System.out.println(i);
		}
	}
}
