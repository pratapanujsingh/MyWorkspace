package com.epam.Trainings.OOPSproblem.Appliances;

public class LIGHT  extends Consumption{


	Consumption consumption;
	 public LIGHT (Consumption consumption) {
		 this.consumption= consumption;		 
	 }
	 public int getTime() {
			return 8;
		}
		
		public int getCost() {
			return 12 + consumption.getCost();
		}	
}