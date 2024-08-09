package ConditionStatement;
import java.util.*;
public class PrintLargestFrom2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("First Number is Greater");

		}
		
		else {
			System.out.println("Second Number is Greater");
		}
	}

}
