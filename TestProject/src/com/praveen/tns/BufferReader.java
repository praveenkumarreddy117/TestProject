package com.praveen.tns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[]args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader bf = new BufferedReader(isr);
		
		System.out.println("ENTER THE NAME");
		
		String name = bf.readLine();
		
		System.out.println("ENTER THE AGE");
		
		int age = Integer.parseInt(bf.readLine());
		
		System.out.println("ENTER THE GENDER");
		
		String gender = bf.readLine();
		
		System.out.println("ENTER THE SALARY");
		
		double salary = Double.parseDouble(bf.readLine());
		
		System.out.println("WELCOME- "+name+"; EMPLOYEE AGE- "+age+"; EMPLOYEE GENDER- "+gender+"; EMPLOYEE SALARY- "+salary+".");
		
		
		
	}
	
}
