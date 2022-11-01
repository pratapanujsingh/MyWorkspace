package com.epam.Trainings.OOPSproblem.Pizza;

	public class Corn extends ToppingsDecorator {

		Pizza pizza;
		 public Corn (Pizza pizza) {
			 this.pizza= pizza;		 
		 }
		 public String getDescription() {
				return pizza.getDescription();
			}
			
			public int getCost() {
				return 60 + pizza.getCost();
			}	
	}

