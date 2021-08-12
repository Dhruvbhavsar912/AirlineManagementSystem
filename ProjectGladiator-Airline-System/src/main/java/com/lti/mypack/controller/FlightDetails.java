package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Flight;
import com.lti.mypack.model.Schedule;
import com.lti.mypack.service.FlightService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/flightsRest/api")
public class FlightDetails {

	@Autowired
	FlightService flightService;
	
	
	
//	@GetMapping("/flights")
//	public List<Flight> getAll(){
//		return flightService.getFlight();
//	}
	
	@GetMapping("flights/{source}/{destination}")
	public List<Flight> getFlights(@PathVariable(value = "source") String source, @PathVariable(value = "destination") String destination){
		return flightService.searchFlight(source, destination);
	}
	
	@GetMapping("flights1/{source}/{destination}/{departureDate}")
	public List<Flight> getFlights1(@PathVariable(value = "source") String source, @PathVariable(value = "destination") String destination, @PathVariable(value = "departureDate") String departureDate){
		return flightService.searchFlight1(source, destination, departureDate);
	}
	
	@GetMapping("flights2/{departureDate}/{source}/{destination}")
	public List<Schedule> getFlights2(@PathVariable(value = "departureDate") String departureDate,@PathVariable(value = "source") String source, @PathVariable(value = "destination") String destination){
		return flightService.searchFlight2(departureDate,source, destination);
	}
	
	
	
	@GetMapping("/flightsbysource/{source}")
	public List<Flight> getFlightsBySource(@PathVariable(value = "source") String source) {
		
		return flightService.findFlightBySource(source);
	}
	
	@GetMapping("/flightsbydestination/{destination}")
	public List<Flight> getFlightsByDestination(@PathVariable(value = "destination") String destination) {
		
		return flightService.findFlightByDestination(destination);
	}
	
	@GetMapping("/flightsbyprice/{lower}/{upper}")
	public List<Flight> getFlightsByPrice(@PathVariable(value = "lower") int lower, @PathVariable(value = "upper") int upper) {
		
		return flightService.findFlightByPrice(lower, upper);
	}
	
	@GetMapping("/flightsbybusinessprice/{lower}/{upper}")
	public List<Flight> getFlightsByBusinessPrice(@PathVariable(value = "lower") int lower, @PathVariable(value = "upper") int upper) {
		
		return flightService.findFlightByBusinessPrice(lower, upper);
	}
}
