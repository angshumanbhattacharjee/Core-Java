package FlightSearch.com.capgemini.flightSearch;

import java.util.Date;

public class FlightPojo {
	static int flightNo;
	String flightName;
	String sourceCity;
	String destinationCity;
	int departureTime;
	int arrivalTime;
	int routeTime;
	int fare;
	
	public FlightPojo(String flightName, String sourceCity, String destinationCity, int departureTime, int arrivalTime,
			int fare) {
		flightNo++;
		this.flightName = flightName;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public static int getFlightNo() {
		return flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public int getFare() {
		return fare;
	}

	public int getRouteTime() {
		if(arrivalTime<departureTime) {
			return 2400+arrivalTime-departureTime;
		}
		return routeTime=arrivalTime-departureTime;
	}
	
	
	

}
