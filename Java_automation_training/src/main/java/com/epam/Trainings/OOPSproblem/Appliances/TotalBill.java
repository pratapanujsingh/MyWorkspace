package com.epam.Trainings.OOPSproblem.Appliances;

public class TotalBill {

	public static void main(String[] args) {
		Consumption consume = new Consumption();
		
		consume= new FAN(consume);
		consume= new LIGHT(consume);
		consume= new TV(consume);
		consume = new LAPTOP(consume);
		System.out.println(consume.getTime() * consume.getCost());

		
	}

}
