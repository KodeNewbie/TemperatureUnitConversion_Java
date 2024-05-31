package com.pack1;

import java.util.Scanner;

public class ClassA 
{
	public static void main(String[] args) 
	{
		System.out.println("Select your input temperature unit : C , F , K : ");
		Scanner scanner = new Scanner(System.in);
		char unit = scanner.next().charAt(0);
		
		System.out.println("Enter the temperature : ");
		float inp = scanner.nextFloat();
		
		switch (unit) {
		case 'C':
			System.out.println("C = " + inp);
			System.out.println("K = " + (inp + 273.15));
			System.out.println("F = " + (inp * (9.0/5.0) + 32));
			break;
			
		case 'F':
			System.out.println("F = " + inp);
			System.out.println("K = " + (( inp - 32 ) * (5.0 / 9.0) + 273.15));
			System.out.println("C = " + ((inp - 32) * 5.0 /9.0));
			break;
			
		case 'K':
			System.out.println("K = " + inp);
			System.out.println("C = " + (inp - 273.15));
			System.out.println("F = " + ((inp - 273.15)*(9.0/5.0) + 32 ));
			break;

		default:
			System.out.println("Error : Invalid Input for temperature unit.");
			break;
		}
	}
}
