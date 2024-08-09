package ConditionStatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to drive a car");
		}
		
		if (age>13 & age<18) {
			System.out.println("Go To School");
		}
		
		else {
			System.out.println("You are Not Eligible.." );
		}	
	}

}
