package Looping;

import java.util.Scanner;

public class AllEvenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		for ( int i=0 ; i <= num ; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
