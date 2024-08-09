package ConditionStatement;
import java.util.Scanner;
public class OddEvenNum {

	public static void main(String[] args) {
		Scanner check=new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num=check.nextInt();

		if(num%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}

	}

}
