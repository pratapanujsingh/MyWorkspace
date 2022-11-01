package com.epam.Trainings.OOPSproblem.Appliances;

public class LAPTOP  extends Consumption{


	Consumption consumption;
	 public LAPTOP (Consumption consumption) {
		 this.consumption= consumption;		 
	 }
	 public int getTime() {
			return 3;
		}
		
		public int getCost() {
			return 60 + consumption.getCost();
		}	
}