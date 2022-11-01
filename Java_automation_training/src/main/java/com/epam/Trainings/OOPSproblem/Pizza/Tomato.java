package com.epam.Trainings.OOPSproblem.Pizza;

public class Tomato extends ToppingsDecorator {

	Pizza pizza;
	
	public Tomato (Pizza pizza) {
		this.pizza = pizza;		
	}
	public String getDescription() {
		return pizza.getDescription();
	}
	
	public int getCost() {
		return 20 + pizza.getCost();
	
	}
}