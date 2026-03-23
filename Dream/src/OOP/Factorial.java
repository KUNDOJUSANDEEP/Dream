package OOP;

import java.util.Scanner;

public class Factorial {

	public int factorial(int n) {
		int mul=1;
		for (int i=1;i<n+1;i++) {
		
			mul=mul*i;
			
		}
		return mul;
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int a = sc.nextInt();		
	Factorial f = new Factorial ();
	int x= f.factorial(a);
	System.out.println("The Factorial of "+ a+" is :"+x );
		 
	}

}
