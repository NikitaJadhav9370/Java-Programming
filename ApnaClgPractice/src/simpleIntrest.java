import java.util.*;
public class simpleIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		int SimpleIntrest=(principal*rate*time)/100;
		System.out.println("Simple Intrest is:" +SimpleIntrest);
	
	}
}
