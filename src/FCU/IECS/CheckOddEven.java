package FCU.IECS;

import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[] args){
		Scanner Number = new Scanner(System.in);
		
		int OddorEven;
		System.out.println("Enter a integer:");
		OddorEven = Number.nextInt();
		if(OddorEven%2==0)
		System.out.printf("The input interger is Even Number.");
		else System.out.printf("The input interger is Odd Number.");		
	}
}