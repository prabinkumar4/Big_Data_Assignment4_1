package Big_Data_Assignment4_1;
import java.util.*;
public class Task3 {

public static Scanner scanner = new Scanner(System.in); 
public static void main(String[] args) { 
	sum(); }

static void sum() { 
	
	System.out.print("First number is : " );
	int firstNumber=scanner.nextInt(); 
	System.out.print("Second number is : " );
	int secondNumber=scanner.nextInt(); 
	int sumofFirstandSecond=firstNumber+secondNumber; 
	System.out.println("Sum is : "+sumofFirstandSecond);
	
} 
}