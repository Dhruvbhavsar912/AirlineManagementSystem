package com.lti.mypack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>, CrudRepository<Flight, Integer> {

	public List<Flight> findFlightByType(String type);
	
	@Query("from Flight f where f.source = ?1")
	public List<Flight> findFlightBySource(String source);
	
	@Query("from Flight f where f.destination = ?1")
	public List<Flight> findFlightByDestination(String destination);
	
	@Query("from Flight f where f.economicFare BETWEEN ?1 AND ?2")
	public List<Flight> findFlightByPrice(int lower, int upper);
	
	@Query("from Flight f where f.businessFare BETWEEN ?1 AND ?2")
	public List<Flight> findFlightByBusinessPrice(int lower1, int upper1);
	
	@Query("from Flight f where f.source = ?1 AND f.destination = ?2")
	public List<Flight> searchFlight(String source, String destination);

	@Query("Select f,s from Flight f, Schedule s where f.source = ?1 AND f.destination = ?2 AND s.departureDate = ?3")
	public List<Flight> searchFlight1(String source, String destination, String departureDate);
}



