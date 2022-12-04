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
		
		System.out.println("WELCOME: "+name);
		
		
		
	}
	
}
