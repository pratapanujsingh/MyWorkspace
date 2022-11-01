package com.epam.Trainings.OOPSproblem.Bouquet;

public class Lilly extends Bouquet {

	Bouquet bouquet;
	 public Lilly (Bouquet bouquet) {
		 this.bouquet= bouquet;		 
	 }
	 public String getDescription() {
			return bouquet.getDescription();
		}
		
		public int getCost() {
			return 60 + bouquet.getCost();
		}	
}