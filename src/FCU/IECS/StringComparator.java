package FCU.IECS;

import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args){
		Scanner  Letter = new Scanner(System.in);
		
		String A;
		String B;
		System.out.println("Enter a string1:");
		A = Letter.nextLine();
		System.out.println("Enter a string2:");
		B = Letter.nextLine();
		
		if(A.equalsIgnoreCase(B))
		System.out.println("The two strings are the same.");
		else System.out.printf("The two strings are not the same.");
		}
}