package com.epam.Trainings.CollectionsUsage;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args){

	   LinkedList<String> animals = new LinkedList<String>();

	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);
	    
	    
	    animals.add(1, "Horse");
	    System.out.println("Updated LinkedList: " + animals);
	  }
	  }
	

