package com.epam.Trainings.OOPSproblem.Appliances;

public class FAN  extends Consumption{


	Consumption consumption;
	 public FAN (Consumption consumption) {
		 this.consumption= consumption;		 
	 }
	 public int getTime() {
			return 2;
		}
		
		public int getCost() {
			return 10 + consumption.getCost();
		}	
}
