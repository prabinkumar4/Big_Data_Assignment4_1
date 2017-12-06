package Big_Data_Assignment4_1;

import java.util.Scanner;

public class multiple_of_n {
	
	public static void main(String[] args) 
    {
        int n,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Input:");
        n=s.nextInt();
 for (i=1;i<=10;i++)
	 System.out.println(n+" * "+i+" = "+(i*n));
	
 s.close();
}
}