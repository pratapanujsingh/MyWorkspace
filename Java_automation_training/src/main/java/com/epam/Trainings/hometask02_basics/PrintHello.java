package com.epam.Trainings.hometask02_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintHello {
	
public static void main(String[] args) throws IOException {
	BufferedReader standardInput
    = new BufferedReader(new InputStreamReader(System.in));
 
System.out.print("Enter your name please: ");
String name = standardInput.readLine();
System.out.println("Hello " + name);

}

}
