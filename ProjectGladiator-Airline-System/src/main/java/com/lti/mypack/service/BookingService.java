package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Booking;

public interface BookingService {
	
	public boolean addBooking(Booking booking);
	public List<Booking> getAllBooking();
	public Booking getBookingDetailsById(int bookid);
	public Booking getBooking();
}
