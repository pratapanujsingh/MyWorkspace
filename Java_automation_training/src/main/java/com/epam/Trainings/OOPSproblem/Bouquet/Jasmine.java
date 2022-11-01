package com.epam.Trainings.OOPSproblem.Bouquet;

public class Jasmine extends Bouquet {

	Bouquet bouquet;
	 public Jasmine (Bouquet bouquet) {
		 this.bouquet= bouquet;		 
	 }
	 public String getDescription() {
			return bouquet.getDescription();
		}
		
		public int getCost() {
			return 60 + bouquet.getCost();
		}	
}