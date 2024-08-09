package ConditionStatement;
import java.util.*;
public class ElseIfProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Adult");
		}
		else if(age>=13 && age<18) {
			System.out.println("teenager");
		}
		else {
			System.out.println("Child");
		}
		
		
		

	}

}
