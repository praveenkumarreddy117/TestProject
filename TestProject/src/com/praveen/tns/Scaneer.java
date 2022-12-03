package com.praveen.tns;

import java.util.Scanner;

public class Scaneer {
	
  public static void main(String[] array){
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter the employee number");
	  
	  int eno = sc.nextInt();
	  
	  System.out.println("enter the employee name");
	  
	  String ename = sc.next();
	
	  System.out.println("enter the employee gender");
	  
	  String egender = sc.next();
	  
	  System.out.println("enter the employee salary");
	  
	  double esalary = sc.nextDouble();
	  
	  System.out.println("employee number "+eno+" employee name "+ename+" employee gender "+egender+" employee salary "+esalary);
	  
  }
	

}
