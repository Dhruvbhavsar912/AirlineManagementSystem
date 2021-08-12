package com.lti.mypackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypackage.model.Flight;
import com.lti.mypackage.repository.FlightRepository;
import com.lti.mypackage.repository.ScheduleRepository;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	ScheduleRepository scheduleRepo;
	
//	@Override
//	public List<Flight> getFlight() {
//		return flightRepo.findAll();
//	}

	@Override
	public Flight findFlight(int flightId) {
		return flightRepo.findById(flightId).get();
	}

	@Override
	public List<Flight> findFlightByType(String type) {
		return flightRepo.findFlightByType(type);
	}

	@Override
	public List<Flight> findFlightBySource(String source) {
		return flightRepo.findFlightBySource(source);
	}

	@Override
	public List<Flight> findFlightByDestination(String destination) {
		return flightRepo.findFlightByDestination(destination);
	}

	@Override
	public List<Flight> findFlightByPrice(int lower, int upper) {
		return flightRepo.findFlightByPrice(lower, upper);
	}

	@Override
	public List<Flight> findFlightByBusinessPrice(int lower1, int upper1) {
		return flightRepo.findFlightByBusinessPrice(lower1, upper1);
	}

	@Override
	public List<Flight> searchFlight(String source, String destination) {
		return flightRepo.searchFlight(source,destination);
	}

	@Override
	public List<Flight> searchFlight1(String source, String destination, String departureDate) {
		return flightRepo.searchFlight1(source, destination, departureDate);
	}

}
