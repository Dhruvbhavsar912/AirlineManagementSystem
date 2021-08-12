package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Booking;
import com.lti.mypack.service.BookingService;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/bookings")
public class BookingController {
	
	
	@Autowired
	BookingService bookService;
	
	@PostMapping("/booking")
	public boolean addBooking(@RequestBody Booking booking) {
		
		return bookService.addBooking(booking);
	}

	@GetMapping("/booking")
	public List<Booking> getAllBooking()
	{
		
		return bookService.getAllBooking();
	}
	
	@GetMapping("/booking/{bookid}")
	public Booking getBookingDetailsById(@PathVariable(value = "bookid") int bookid ) {
		
		return bookService.getBookingDetailsById(bookid);
		
	}
	
	@GetMapping("/bookinglatest")
	public Booking getBooking()
	{
		return bookService.getBooking();
	}
}
