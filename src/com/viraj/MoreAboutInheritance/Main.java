package com.viraj.MoreAboutInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle myVehicle = new Vehicle(500, 4);
		myVehicle.ride();
		System.out.println(myVehicle.toString());
		
		Car myCar = new Car(90, 4);
		myCar.ride();
		System.out.println(myCar.toString());
		
		Motorcycle myMotorcycle = new Motorcycle(88, 2);
		myMotorcycle.ride();
		System.out.println(myMotorcycle.toString());

	}

}
