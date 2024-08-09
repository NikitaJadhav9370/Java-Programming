package Functions;

public class MethodOverloading {
	public static int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public static int sum(int a , int b, int c) {
		int sum=a+b+c;
		return sum;
	}
	
	public static int multiply(int x, int y) {
		int product = x*y;
		return product;
	}
	public static float multiply(float x, float y) {
		float product = x*y;
		return product;
	}

	public static void main(String[] args) {
		System.out.println(sum(1,3));
		System.out.println(sum(9,6,4));
		System.out.println(multiply(1,3));
		System.out.println(multiply(9.5f , 0.5f));
		

	}

}
