package com.hexa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {
	
	@Id
	private int busId;
	private String busPName;
	private String busDestination;
	private String busLocation;
	private int busPrice;
	

	public Bus(){ }
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busPName=" + busPName + ", busDestination=" + busDestination
				+ ", busLocation=" + busLocation + ", busPrice=" + busPrice + "]";
	}
	public Bus(int busId, String busPName, String busDestination, String busLocation, int busPrice) {
		super();
		this.busId = busId;
		this.busPName = busPName;
		this.busDestination = busDestination;
		this.busLocation = busLocation;
		this.busPrice = busPrice;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusPName() {
		return busPName;
	}
	public void setBusPName(String busPName) {
		this.busPName = busPName;
	}
	public String getBusDestination() {
		return busDestination;
	}
	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}
	public String getBusLocation() {
		return busLocation;
	}
	public void setBusLocation(String busLocation) {
		this.busLocation = busLocation;
	}
	public int getBusPrice() {
		return busPrice;
	}
	public void setBusPrice(int busPrice) {
		this.busPrice = busPrice;
	}
	}
