package com.viraj.MoreAboutInheritance;

// This is my super class

public class Vehicle {
	
	// Instance Variables
	
	private int speed;
	private final boolean hasBrakingSystem = true;
	private int numberOfWheels;
	
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
	
	
	
	
	

}
