package Operators;
import java.util.*;
public class PositiveORNegative {

	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		System.out.println("Lets Check Your Number Is Positive OR Negative....");
		System.out.println("So Enter Your Number : ");
		int number = check.nextInt();
		if(number>=0) {
			System.out.println("Your Number is \"POSITIVE\" ");
		}
		else {
			System.out.println("Your Number is \"NEGATIVE\" ");
			
		}
		

	}

}
