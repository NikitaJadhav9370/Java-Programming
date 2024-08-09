import java.util.Scanner;

public class TotalWithGST {

	/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
	an eraser. You have to output the total cost of the items back to the user as their bill.
	(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float pencil = sc.nextFloat();
		float pen = sc.nextFloat();
		float eraser = sc.nextFloat();
		Float total = pencil+pen+eraser;
		System.out.println("Total Bill Is: " +total);
		
		// Here Add GST......
		float GstAdded = total +(0.18f*total);
		System.out.println(" Total With GST of 18% :" + GstAdded);
		
		

	}
ss
}
