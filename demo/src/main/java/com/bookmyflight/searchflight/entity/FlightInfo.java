package com.bookmyflight.searchflight.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flightinfo")
public class FlightInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FLIGHT_ID")
	private int flightId;

	@Column(name = "FLIGHT_NAME")
	private String flightName;

	@Column(name = "FLIGHT_NUMBER")
	private String flightNumber;

	@Column(name = "SOURCE")
	private String source;

	@Column(name = "DESTINATION")
	private String destination;

	@Column(name = "PRICE")
	private String price;

	@Column(name = "DEPART_DATE")
	private String departDate;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDepartDate() {
		return departDate;
	}

	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}

	@Override
	public String toString() {
		return "FlightInfo [flightId=" + flightId + ", flightName="
				+ flightName + ", flightNumber=" + flightNumber + ", source="
				+ source + ", destination=" + destination + ", price=" + price
				+ ", departDate=" + departDate + "]";
	}

}