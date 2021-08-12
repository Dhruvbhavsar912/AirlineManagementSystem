package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Flight;
import com.lti.mypack.model.Schedule;

public interface FlightService {

//	public List<Flight> getFlight();
	public Flight findFlight(int flightId);
	public List<Flight> findFlightByType(String type);
	public List<Flight> findFlightBySource(String source);
	public List<Flight> findFlightByDestination(String destination);
	public List<Flight> findFlightByPrice(int lower, int upper);
	public List<Flight> findFlightByBusinessPrice(int lower1, int upper1);
	public List<Flight> searchFlight(String source, String destination);
	public List<Flight> searchFlight1(String source, String destination, String departureDate);
	public List<Schedule> searchFlight2(String departureDate, String source, String destination);
}
