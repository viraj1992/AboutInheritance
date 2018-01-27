package com.viraj.MoreAboutInheritance;

// This is my super class

public class Vehicle {
	
	// Instance Variables
	
	private int speed;
	private final boolean hasBrakingSystem = true;
	private int numberOfWheels;
	private int rideSpeed;
	
	// Created Constructor
	
	public Vehicle(int speed, int numberOfWheels) {
		this.speed = speed;
		this.numberOfWheels = numberOfWheels;
	}
	
	// set speed
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// get speed
	
	public int getSpeed() {
		return speed;
	}
	
	// set numberOfWheels
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	// get numberOfWheels
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public int getRideSpeed() {
		return rideSpeed;
	}

	public void setRideSpeed(int rideSpeed) {
		this.rideSpeed = rideSpeed;
	}
	
	// Instance method ride
	
	public void ride() {
		int result = getSpeed() * getNumberOfWheels();
		rideSpeed = result;
	}

	@Override
	public String toString() {
		
		return String.format("%s : %d | %s : %b | %s : %d | %s : %d" , "Speed", getRideSpeed(), "Has Breaking System"
				, getHasBrakingSystem()  ,"Number of Wheels", getNumberOfWheels(), "Ride Speed", getRideSpeed());
	}

	public boolean getHasBrakingSystem() {
		return hasBrakingSystem;
	}
	



	
	
	
	
	
	

}
