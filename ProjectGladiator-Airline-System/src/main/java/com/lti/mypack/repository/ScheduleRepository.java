package com.lti.mypack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lti.mypack.model.Schedule;

public interface ScheduleRepository extends CrudRepository<Schedule, Integer>, JpaRepository<Schedule, Integer>{
	

	@Query("from Schedule s full join Flight f on f.flightId = s.flight.flightId where s.departureDate = :date AND  f.source = :source  AND f.destination = :destination")
	public List<Schedule> searchFlight2(  @Param("date") String departureDate,  @Param("source") String source, @Param("destination")  String destination);
	
	
}
