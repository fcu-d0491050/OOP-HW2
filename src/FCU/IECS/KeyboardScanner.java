package FCU.IECS;

import java.util.Scanner;
public class KeyboardScanner{
	public static void main(String[] args){
	Scanner N = new Scanner(System.in);
	
	int A;
	float B;
	String C;
	System.out.println("Enter a integer:");
	A=N.nextInt();
	System.out.println("Enter a float point number:");
	B=N.nextFloat();
	System.out.println("Enter a you name:");
	C=N.next();
	
	System.out.printf("Hi %s, the multiplication of %d and %f is %e",C,A,B,A*B);
	}
}
