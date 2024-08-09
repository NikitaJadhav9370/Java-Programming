package Operators;
import java.util.*;
public class StdPassFail {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Marks :");
		float marks=sc.nextFloat();
		
		String ReportCard=(marks>=35)? "PASS" :"FAIL";
		System.out.println(ReportCard);
		
//		if(marks>=35) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
		
	}

}
