package Functions;

public class BinomialCoefficient {
	public static int factorial() {
		int f = 1;
		for(int i=1 ; i<=n ; i++) {
			f=f*i;
		}
		return f;
		
    public static int  BinomialCoeff(int n , int r) {
    	int fact_n = factorial(n);
    	int fact_r = factorial(r);
    	int fact_bin = factorial(n-r);
    	int binCoeff = fact_n / (fact_r * fact_bin);
    	return BinomialCoeff;
    }
		
		
	}

	public static void main(String[] args) {
		System.out.println(BinomialCoeff(5,2));
		

	}

}
