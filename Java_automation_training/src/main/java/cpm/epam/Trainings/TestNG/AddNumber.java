package cpm.epam.Trainings.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AddNumber {
	
	  private static int  a= 5; 
	  private static int  b= 8;  
  @Test
  public void calculate() throws NumberFormatException, IOException {
	  
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
      int a=Integer.parseInt(br.readLine());  
      int b=Integer.parseInt(br.readLine());  
      System.out.println(a+b); 
	  
	 
  }
  @BeforeClass
  public void beforeMethod() {
	  
	  System.out.println("-----Enter numbers: ----");
  }

  @AfterClass
  public void afterMethod() {
	  
	  System.out.println("------calculation completed-----");
  }

}
