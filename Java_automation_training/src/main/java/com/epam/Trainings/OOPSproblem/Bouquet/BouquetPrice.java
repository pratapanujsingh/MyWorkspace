package com.epam.Trainings.OOPSproblem.Bouquet;


public class BouquetPrice {

	public static void main(String[] args) {
		
		Bouquet bouquet1 = new Flowers();
		bouquet1 = new Jasmine(bouquet1);
		bouquet1 = new Lilly(bouquet1);
		bouquet1 = new Rose(bouquet1);
		
		System.out.println(bouquet1.getDescription() + " Bouquet cost : "+ bouquet1.getCost());
		
		
		
	}

}
