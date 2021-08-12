package com.lti.mypack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="flights_master")
public class Flight {

	@Id
	@Column(name="flight_no")
	private String flightId;
	
	@Column(name="flight_name")
	private String flightName;

	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="type")
	private String type;
	
	@Column(name="status")
	private String status;
	
	@Column(name="Economic_class_fare")
	private int economicFare;
	
	@Column(name="Business_class_fare")
	private int businessFare;
	
	@Column(name="no_of_economic_seats")
	private int economicSeats;
	
	@Column(name="no_of_business_seats")
	private int businessSeats;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Flight(String flightId, String flightName, String source, String destination, int duration, String type,
			String status, int economicFare, int businessFare, int economicSeats, int businessSeats) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.type = type;
		this.status = status;
		this.economicFare = economicFare;
		this.businessFare = businessFare;
		this.economicSeats = economicSeats;
		this.businessSeats = businessSeats;
	}

	public String getFlightId() {
		return flightId;
	}


	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}


	public String getFlightName() {
		return flightName;
	}


	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getEconomicFare() {
		return economicFare;
	}


	public void setEconomicFare(int economicFare) {
		this.economicFare = economicFare;
	}


	public int getBusinessFare() {
		return businessFare;
	}


	public void setBusinessFare(int businessFare) {
		this.businessFare = businessFare;
	}


	public int getEconomicSeats() {
		return economicSeats;
	}


	public void setEconomicSeats(int economicSeats) {
		this.economicSeats = economicSeats;
	}


	public int getBusinessSeats() {
		return businessSeats;
	}


	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}
	
}
