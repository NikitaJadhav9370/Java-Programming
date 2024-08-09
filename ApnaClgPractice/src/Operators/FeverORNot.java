package Operators;
import java.util.*;
public class FeverORNot{

	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		System.out.println("Check Your Health Status");
		System.out.println("Enter Your Tempreture : ");
		int temp = check.nextInt();
		if(temp>100) {
			System.out.println("You have Fever ! ");
		}
		else {
			System.out.println("You are Normal !");
			
		}
		

	}

}