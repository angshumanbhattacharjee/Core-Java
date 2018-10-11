package FlightSearch.com.capgemini.flightSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;



public class FlightService {
	
	ArrayList<FlightPojo> flightDetails= new ArrayList<FlightPojo>();
	
	public void addFlights(FlightPojo flight) {
		flightDetails.add(flight);
	}
	
	public ArrayList<FlightPojo> removeFlights(int flightId) {
		for(FlightPojo fl: flightDetails) {
			if (FlightPojo.getFlightNo()==flightId) {
				flightDetails.remove(fl);
				return flightDetails;
			}
		}
		throw new RuntimeException("Cannot remove flight");
	}
	
	public ArrayList<FlightPojo> getallFlights() {
		return flightDetails;
	}
	
	public ArrayList<FlightPojo> updateBySourceCity(int flightNo, String sourceCity) {
		for(FlightPojo fl: flightDetails) {
			if (FlightPojo.getFlightNo()==flightNo) {
				fl.setSourceCity(sourceCity);
				return flightDetails;
			}
		}
		throw new RuntimeException("Cannot update source city");
	}
	
	public ArrayList<FlightPojo> updateByDestinationCity(int flightNo, String destinationCity) {
		for(FlightPojo fl: flightDetails) {
			if (FlightPojo.getFlightNo()==flightNo) {
				fl.setDestinationCity(destinationCity);
				return flightDetails;
			}
		}
		throw new RuntimeException("Cannot update destination city");
	}
	
	public ArrayList<FlightPojo> updateByArrivalTime(int flightNo, int arrivalTime) {
		for(FlightPojo fl: flightDetails) {
			if (FlightPojo.getFlightNo()==flightNo) {
				fl.setArrivalTime(arrivalTime);
				return flightDetails;
			}
		}
		throw new RuntimeException("Cannot update Arrival time");
	}
	
	public ArrayList<FlightPojo> updateByDepartureTime(int flightNo, int departureTime) {
		for(FlightPojo fl: flightDetails) {
			if (FlightPojo.getFlightNo()==flightNo) {
				fl.setDepartureTime(departureTime);
				return flightDetails;
			}
		}
		throw new RuntimeException("Cannot update Arrival time");
	}
	
	public ArrayList<FlightPojo> sortFlightDetailsByFare(){
		Collections.sort(flightDetails, new Comparator<FlightPojo>() {

			public int compare(FlightPojo flight1, FlightPojo flight2) {
				return flight1.getFare()-(flight2.getFare());
			}
			
		});
		return flightDetails;
	}
	
	public ArrayList<FlightPojo> sortFlightDetailsByTime(){
		Collections.sort(flightDetails, new Comparator<FlightPojo>() {

			public int compare(FlightPojo flight1, FlightPojo flight2) {
				return flight1.getRouteTime()-(flight2.getRouteTime());
			}
			
		});
		return flightDetails;
	}
	
	public ArrayList<FlightPojo> morningFlights()
    {
		ArrayList<FlightPojo> morningFlights=new ArrayList<FlightPojo>();
		for (FlightPojo flight : flightDetails) {
			if (flight.getDepartureTime()>=600 && flight.getDepartureTime()<1200)
				morningFlights.add(flight);
			return morningFlights;
		}

		throw new RuntimeException("flight does not exist");
	} 
}
