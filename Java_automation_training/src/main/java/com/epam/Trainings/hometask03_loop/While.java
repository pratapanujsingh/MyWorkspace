package com.epam.Trainings.hometask03_loop;
import java.util.Scanner;
	
	
	class While{
	public static void main(String args[]){
		
	    int i,j;  //variable declaration
	    
	    Scanner scan=new Scanner(System.in);
	//create a scanner object for input
	//get input from the user for rows
	    
	System.out.print("Enter the number of rows: ");
	int rows=scan.nextInt();
	System.out.print("\n");
	i=1; 
	while(i<=rows){  //parent while loop
	    j=i; 
	  while(j<=rows){
	  System.out.print(" ");//print space
	  j++;
	  }
	  j=1;
	  while( j<=2*i-1){
	  System.out.print("i");//print star
	   j++;
	  }
	  
	  System.out.print("\n");//move to next line
	i++;
	}
	}
	}
	
