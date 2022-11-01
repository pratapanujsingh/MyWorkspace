package com.epam.Trainings.CollectionsUsage;

import java.util.HashSet;

public class Hash_Set {
	
	public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<Integer>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<Integer>();
        
        numbers.addAll(evenNumber);
        numbers.add(8);
        System.out.println("New HashSet: " + numbers);
    }

}
