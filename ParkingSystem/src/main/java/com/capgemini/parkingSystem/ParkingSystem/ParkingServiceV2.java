package com.capgemini.parkingSystem.ParkingSystem;

import java.util.HashMap;
import java.util.Map;

public class ParkingServiceV2 {

	static Map<ParkingId, CustomerDetails> car;
	static int floor=1, section=1, compartment=0;
	
	public ParkingServiceV2() {
		car= new HashMap<ParkingId, CustomerDetails>();
	}
	
	public ParkingId addCar(CustomerDetails cust)
    {      
		System.out.println("hfybhyhy");
           if(floor>4) {
        	   throw new RuntimeException("No space available");
           }
           else {
        	   
        	   System.out.println("345345345");
        	   if(section>4) {
        		   floor++;
        		   section=1;
        		   compartment=0;
        		   ParkingId key=new ParkingId(floor,section,compartment);
        		   car.put(key, cust);
                   cust.setParkid(key);
                   compartment++;
                   System.out.println("Compartment no iegh:  "+compartment);
                   return key;
        	   }
        	   else {
        		   if(compartment>9) {
        			   section++;
        			   compartment=0;
        			   ParkingId key=new ParkingId(floor,section,compartment);
        			   car.put(key, cust);
                       cust.setParkid(key);
                       compartment++;
                       System.out.println("Compartment no:  "+compartment);
                       return key;
        		   }
        		   else {
        			   ParkingId key=new ParkingId(floor,section,compartment);
        			   car.put(key, cust);
                       cust.setParkid(key);
                       compartment++;
                       System.out.println("comaprtment no:  "+compartment);
                       return key;
                       
        		   }
        	   }
           }
    }
	
	public static void main(String[] args) {
		ParkingService park= new ParkingService();
		CustomerDetails c1=new CustomerDetails("angshu","879845666");
		CustomerDetails c2=new CustomerDetails("arnab","879845666");
		CustomerDetails c3=new CustomerDetails("abhishek","879845666");
		CustomerDetails c4=new CustomerDetails("angbhatt","879845666");
		CustomerDetails c5=new CustomerDetails("angshuman","879845666");
		CustomerDetails c6=new CustomerDetails("anqwert","879845666");
		CustomerDetails c7=new CustomerDetails("angtutua","879845666");
		CustomerDetails c8=new CustomerDetails("bibhash","879845666");
		CustomerDetails c9=new CustomerDetails("sanu","879845666");
		CustomerDetails c10=new CustomerDetails("san","879845666");
		CustomerDetails c11=new CustomerDetails("sanbhatt","87985666");
		System.out.println(park.addCar(c1));
		System.out.println(park.addCar(c2));
		System.out.println(park.addCar(c3));
		System.out.println(park.addCar(c4));
		System.out.println(park.addCar(c5));
		System.out.println(park.addCar(c6));
		System.out.println(park.addCar(c7));
		System.out.println(park.addCar(c8));
		
		System.out.println(park.addCar(c9));
		System.out.println(park.addCar(c10));
		System.out.println(park.addCar(c11));

		
		
//		for(HashMap.Entry m: car.entrySet()) {
//			System.out.println(m);
//		}
	}
}
