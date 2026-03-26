package DailyCode;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		int sum = 0;
		for (int i = 1; i<=x/2;i++) {
			if(x%i==0) {
				sum+=i;
			}
		}
		
		if(sum==x) {
			System.out.println("The Number "+x+" is Perfect number");
		}
		else System.out.println("The Number "+x+" is not a Perfect number");
		

	}

}
