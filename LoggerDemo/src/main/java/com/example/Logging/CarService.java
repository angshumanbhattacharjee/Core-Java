package com.example.Logging;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	
	private final Logger log= LoggerFactory.getLogger(CarService.class);
	
	public void Process(String message) {
		 log.debug("processing car: {}", message);
		 char n= '\n';
		 System.out.println(n);
	}

}
