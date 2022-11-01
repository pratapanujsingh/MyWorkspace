package com.epam.Trainings.OOPSproblem.Pizza;

public class Store {

	public static void main(String[] args) {
		
		Pizza pizza = new Standard ();// created standard pizza
		
		System.out.println(pizza.getDescription() + " Pizza cost : " + pizza.getCost());
		
		Pizza pizza2 = new Base(); // created base pizza 
		
		pizza2 = new Tomato(pizza2); // with tomato toppings
		pizza2 = new Corn(pizza2); // with corn toppings
		pizza2 = new Mushroom(pizza2); // with mushroom toppings 
		
		System.out.println(pizza2.getDescription() + " Pizza cost : "+ pizza2.getCost());
		

	}

}
