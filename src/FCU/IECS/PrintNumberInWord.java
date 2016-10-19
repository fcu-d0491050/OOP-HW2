package FCU.IECS;

import java.util.Scanner;
public class PrintNumberInWord {
    public static void main(String[] args){
        Scanner  Number = new Scanner(System.in);
    
    int integer;
    System.out.println("Enter a integer:");
    integer = Number.nextInt();
    if(integer==1)
	    System.out.printf("The input interger is \"ONE\"");
    if(integer==2)
	 	 System.out.printf("The input interger is \"TWO\"");
    if(integer==3)
	 	 System.out.printf("The input interger is \"THREE\"");
    if(integer==4)
	 	 System.out.printf("The input interger is \"FOUR\"");
    if(integer==5)
	 	 System.out.printf("The input interger is \"FIVE\"");
    if(integer==6)
	 	 System.out.printf("The input interger is \"SIX\"");
    if(integer==7)
	 	 System.out.printf("The input interger is \"SEVEN\"");
    if(integer==8)
	 	 System.out.printf("The input interger is \"EIGHT\"");
    if(integer==9)
	 	 System.out.printf("The input interger is \"NINE\"");
    else System.out.printf("The input interger is \"OTHER\"");
   }
}