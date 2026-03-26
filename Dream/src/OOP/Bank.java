package OOP;

import java.util.Scanner;

public class Bank {
	String name;
	static int balance=0;
	static int x = 0;
	
	static void deposit(int amount) {
		x =balance+amount;
		System.out.println("Thank You For Deposit :"+amount);
	}
	
	static void withdraw (int amount1) {
		if(x<amount1) {
			System.out.println("Your Balance is Low");
		}
		else {
		x =x-amount1;
		System.out.println(amount1+" is Debited From your account");
		}
	}

	static void balance () {
		 
		System.out.println("Amount in your Account : "+x);
	}
	
	public static void main(String[] args) {
		int x;
		do {
			
			System.out.println("Welcome to PVB Bank");
			System.out.println("Choose any option");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance Enquiry");
			System.out.println("4. Exit");
			Scanner sc = new Scanner(System.in);
			 x = sc.nextInt();
			 
			 switch (x) {
			 case 1 : {System.out.println("Enter the amount");
			 int amount=sc.nextInt();
			          deposit (amount);}
			 break;
			          
			 case 2 : {System.out.println("Enter the amount to withdraw :");
			 int amount1=sc.nextInt();
			 withdraw(amount1);
			 }
			 break;
			 case 3 : 
		         balance();
		         
			 case 4 : System.out.println("Thank you for Banking");
			
		      
	           }
			 }		 
			 
		while( x <= 5) ;

	}

}
