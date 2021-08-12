package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.mypack.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	@Query("from Booking b where b.bookingid=(select max(bb.bookingid) from Booking bb)")
	public Booking getBooking();
}
