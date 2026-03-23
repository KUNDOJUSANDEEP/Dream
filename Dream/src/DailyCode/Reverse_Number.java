package DailyCode;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int x = sc.nextInt();
		
		int rev=0;
		while(x>0) {
			int lastDigit = x%10;
			rev=rev*10+lastDigit;
			x=x/10;
		}
		
		System.out.println("The Reverse number is : "+ rev);
	}

}
