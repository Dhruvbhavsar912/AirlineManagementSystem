package com.lti.mypack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Bookings")
public class Booking {

	@Id
	@SequenceGenerator(name = "bookingseq", sequenceName = "bookseq",
    initialValue = 10001, allocationSize = 1)
	@GeneratedValue(generator = "bookingseq")
	@Column(name="Booking_id") //Sequence Generator - Autogenerate
	private int bookingid;
	
	@ManyToOne
	@JoinColumn(name="schedule_id_s2d",referencedColumnName = "schedule_id" )// Join with Flight Schedule
	private Schedule scheduleids2d;

	@ManyToOne
	@JoinColumn(name="schedule_id_d2s",referencedColumnName = "schedule_id" )
	private Schedule scheduleidd2s;
	
	@Column(name="NO_OF_PASSENGERS") //Input - Save
	private int noOfPassengers;
		
	@Column(name="BOOKING_DATE")  //Input - Save (Auto)
	private String bookingdate;
	
	@Column(name="user_id")   //Join with UserDetails  - Save
	private String userid;
	
	@Column(name="TOTAL_COST") //Input - calculate  - Save
	private int totalCost;

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public  Schedule getScheduleids2d() {
		return scheduleids2d;
	}

	public void setScheduleids2d( Schedule scheduleids2d) {
		this.scheduleids2d = scheduleids2d;
	}

	public Schedule getScheduleidd2s() {
		return scheduleidd2s;
	}

	public void setScheduleidd2s(Schedule scheduleidd2s) {
		this.scheduleidd2s = scheduleidd2s;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public  String  getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate( String  bookingdate) {
		this.bookingdate = bookingdate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public Booking(int bookingid, Schedule scheduleids2d, Schedule scheduleidd2s, int noOfPassengers, String  bookingdate,
			String userid, int totalCost) {
		super();
		this.bookingid = bookingid;
		this.scheduleids2d = scheduleids2d;
		this.scheduleidd2s = scheduleidd2s;
		this.noOfPassengers = noOfPassengers;
		this.bookingdate = bookingdate;
		this.userid = userid;
		this.totalCost = totalCost;
	}

	
	
	public Booking() {
		super();
	}
	
	
	
	
	

}
