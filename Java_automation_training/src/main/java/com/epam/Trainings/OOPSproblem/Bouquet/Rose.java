package com.epam.Trainings.OOPSproblem.Bouquet;

public class Rose extends Bouquet {

	Bouquet bouquet;
	 public Rose (Bouquet bouquet) {
		 this.bouquet= bouquet;		 
	 }
	 public String getDescription() {
			return bouquet.getDescription();
		}
		
		public int getCost() {
			return 60 + bouquet.getCost();
		}	
}