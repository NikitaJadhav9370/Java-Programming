package ConditionStatement;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your yearly income :");
		int income = sc.nextInt();
		int tax;
		if(income<500000) {
			System.out.println("0% tax");
		}
		else if(income>=500000 && income<1000000) {
			System.out.println("20% tax");
		}
		else {
			System.out.println("30% tax");
		}

	}

}
