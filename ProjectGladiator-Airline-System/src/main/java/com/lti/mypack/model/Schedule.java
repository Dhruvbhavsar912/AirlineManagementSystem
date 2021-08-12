package com.lti.mypack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="flight_schedule")
public class Schedule implements Serializable{

	@Id
	@Column(name="schedule_id")
	private String scheduleId;
	
	@Column(name="arrival_date")
	private String arivalDate;
	
	@Column(name="departure_date")
	private String departureDate;
	
	@Column(name="arrival_time")
	private int arrivalTime;
	
	@Column(name="departure_time")
	private int departureTime;
	
	@Column(name="no_of_economic_seats_available")
	private int economicAvail;
	
	@Column(name="no_of_business_seats_available")
	private int businessAvail;
	
	@Column(name="admin_id")
	private String adminid;
	
	@ManyToOne
	@JoinColumn(name="flight_no")
	private Flight flight;

	public Schedule() {
		super();
	}

	public Schedule(String scheduleId, String arivalDate, String departureDate, int arrivalTime, int departureTime,
			int economicAvail, int businessAvail, String adminid, Flight flight) {
		super();
		this.scheduleId = scheduleId;
		this.arivalDate = arivalDate;
		this.departureDate = departureDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.economicAvail = economicAvail;
		this.businessAvail = businessAvail;
		this.adminid = adminid;
		this.flight = flight;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getArivalDate() {
		return arivalDate;
	}

	public void setArivalDate(String arivalDate) {
		this.arivalDate = arivalDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public int getEconomicAvail() {
		return economicAvail;
	}

	public void setEconomicAvail(int economicAvail) {
		this.economicAvail = economicAvail;
	}

	public int getBusinessAvail() {
		return businessAvail;
	}

	public void setBusinessAvail(int businessAvail) {
		this.businessAvail = businessAvail;
	}

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
