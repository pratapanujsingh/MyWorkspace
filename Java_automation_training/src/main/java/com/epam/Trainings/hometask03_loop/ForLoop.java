package com.epam.Trainings.hometask03_loop;

import java.util.Scanner;

public class ForLoop {

		public static void main(String[] args) {
			int rows;
			int number;
	    Scanner scanner = new Scanner (System.in);
	    System.out.println("Enter rows count and starting digit: ");
rows = scanner.nextInt();
number = scanner.nextInt();
	    for(int i = 1; i <= rows; i++) {

	      for(int j = 1; j <= i; j++) {
	        System.out.print(number + " ");
	        number++;
	      }
	      System.out.println();
	    }
	  }
	}
