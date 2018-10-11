package com.example.Logging;



import org.junit.Test;

public class CarServiceTest {

	@Test
	public void testProcess() {
		CarService carservice= new CarService();
		carservice.Process("BMW");
	}
}
