package com.epam.Trainings.OOPSproblem.Appliances;

public class TV  extends Consumption{


	Consumption consumption;
	 public TV (Consumption consumption) {
		 this.consumption= consumption;		 
	 }
	 public int getTime() {
			return 5;
		}
		
		public int getCost() {
			return 25 + consumption.getCost();
		}	
}