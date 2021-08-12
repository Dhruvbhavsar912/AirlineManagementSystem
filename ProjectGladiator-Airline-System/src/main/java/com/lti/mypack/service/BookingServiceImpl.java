package com.lti.mypack.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Booking;
import com.lti.mypack.repository.BookingRepository;

import java.util.List;


@Service
@Transactional
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingRepository bookRepo;
	
	
	@Override
	public List<Booking> getAllBooking() {

		return bookRepo.findAll();
	}

	@Override
	public boolean addBooking(Booking booking) {
		
		bookRepo.save(booking);
		
		return false;
	}

	@Override
	public Booking getBookingDetailsById(int bookid) {
		return bookRepo.findById(bookid).get();
	}

	@Override
	public Booking getBooking() {		
		
		return bookRepo.getBooking();
		
		
	}

}
