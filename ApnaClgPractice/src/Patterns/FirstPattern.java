package Patterns;

public class FirstPattern {

	public static void main(String[] args) {
		
/*	
       1) Que_____>	
            *
            *  *
            *  *  *
            *  *  *  *
         
       Ans_______>
       	
		for (int line=0 ; line<=4 ; line++) {
			for ( int star=0 ; star<=line ; star++) {
				System.out.print("  *");
			}
			System.out.println();
		}   

		  2) Que_____>	
          
          *  *  *  *
          *  *  *
          *  *
          *  
       
     Ans_______>
     	
		int n=4;
		for ( int i = 1 ; i<=4 ; i++) {
			for ( int j=1 ; j<=(n-i+1) ; j++){
				System.out.print(" *");
			}
			System.out.println();
		}

		3) Que_____>	
		 1
		 1 2
		 1 2 3
		 1 2 3 4 
		 
		 Ans _____>
		 
		for (int line=1 ; line <=4 ; line++) {
			for ( int star=1 ; star <= line ; star++) {
				System.out.print(" " +star);
			}
			System.out.println();
			
		}
*/
		int n = 4;
		char ch= 'A';
		
		for (int line=1 ; line<=n ; line++) {
			for (int chars =1 ; chars<=line ; chars++) {
				System.out.print(" " +ch);
				ch++;
			}
			System.out.println();
		}

	}

}
