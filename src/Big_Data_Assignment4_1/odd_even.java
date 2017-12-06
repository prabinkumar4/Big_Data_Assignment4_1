package Big_Data_Assignment4_1;
import java.util.Scanner;

public class odd_even {

	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in); 
		 int firstNumber,secondNumber; 
		 System.out.println("Enter the first number");
		 firstNumber=s.nextInt(); //getting first number from user 
		 System.out.println("Enter the second number");
		 secondNumber=s.nextInt(); //getting second number from user 
		 
		 System.out.println("The even numbers are"); 
		 for(int i=firstNumber;i<=secondNumber;i++) { 
			 if(i%2==0) System.out.println(i);
			 } 
		 System.out.println("The odd numbers are"); 
		 for(int i=firstNumber;i<=secondNumber;i++) {
			 if(i%2!=0) System.out.println(i); 
			 
			 s.close();
			 }
		 }
	 }
	 