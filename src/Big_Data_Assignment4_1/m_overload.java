package Big_Data_Assignment4_1;
import java.util.Scanner;
public class m_overload {

public static void main(String args[]) {
	 Scanner s=new Scanner(System.in); 
	 System.out.println("1.Sum of two numbers \n2.Sum of three numbers");
	int a =s.nextInt();
	 switch (a){ 
	 case 1 :
	 System.out.println("Enter two numbers");
	 int x=s.nextInt();
	 int y=s.nextInt(); 
	 int q=sum(x,y); //calling the method sum which accepts two integers 
	 System.out.println("Sum of two numbers : "+q); 
	 break; 
	 case 2 : System.out.println("Enter three numbers"); 
	 int b=s.nextInt(); 
	 int c=s.nextInt(); 
	 int d=s.nextInt();
	 int p=sum(b,c,d); //calling the method sum which accepts three integers 
	 System.out.println("Sum of three numbers : " +p); 
	 break; }
	 } 
	 public static int sum(int a,int b) //creating a method sum which accepts two integer 
	 { 
	 return a+b; //return int type 
	 } 
	 public static int sum(int a,int b,int c) //creating a method sum which accepts three integer 
	 { return a+b+c; //return int type 
	 
	 }
	 //s.close();
	 }
