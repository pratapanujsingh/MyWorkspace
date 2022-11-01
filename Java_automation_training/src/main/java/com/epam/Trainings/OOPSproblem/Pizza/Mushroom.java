package com.epam.Trainings.OOPSproblem.Pizza;

public class Mushroom extends ToppingsDecorator {

	Pizza pizza;
	 public Mushroom (Pizza pizza) {
		 this.pizza= pizza;		 
	 }
	 public String getDescription() {
			return pizza.getDescription();
		}
		
		public int getCost() {
			return 60 + pizza.getCost();
		}	
}
