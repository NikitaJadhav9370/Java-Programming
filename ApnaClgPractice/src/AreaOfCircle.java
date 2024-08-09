import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
    	System.out.println("Enter Radius:");
    	Scanner sc = new Scanner(System.in);
    	float rad = sc.nextFloat();
    	float AreaOfCirle=3.14f*rad*rad;
    	System.out.println(AreaOfCirle);
    }
}
