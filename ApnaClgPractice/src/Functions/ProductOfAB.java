package Functions;
import java.util.*;
public class ProductOfAB {
	public static int multiply(int a , int b) {
		int multiply=a*b;
		return multiply;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter value of B: ");
		int b =sc.nextInt();
		int product = multiply(a , b);
		System.out.println("Mutiplication Of A and B :" +product);
		
		

	}

}
