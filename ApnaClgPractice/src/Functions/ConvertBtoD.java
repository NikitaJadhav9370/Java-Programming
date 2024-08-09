package Functions;

public class ConvertBtoD {
	public static void Conversion(int binNum) {
		int myNum= binNum;
		int pow = 0;
		int decNum = 0;
		while(binNum>0) {
			int LastDigit = binNum %10;
			decNum = decNum + (LastDigit * (int) Math.pow(2, pow));
			pow++;
			binNum = binNum/10;
		}
		System.out.println("Decimal of " +myNum +" = "+ decNum);
		
	}

	public static void main(String[] args) {
		Conversion(111);	
	}

}
