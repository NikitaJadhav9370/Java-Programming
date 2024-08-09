package Operators;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which One You Like To Eat Buddy :");
		int choice =sc.nextInt();
		switch(choice) {
		case 1 : System.out.println("Ohh You Like Burger");
		       break;
		case 2 : System.out.println("Great Pick spicy Pizza");
		       break;
		case 3 : System.out.println("Yehh !! French Fries");
		       break;
		case 4 : System.out.println("...Cold Coffe");
		       break;
		}
	}

}
