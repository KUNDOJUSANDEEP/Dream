package OOP;

import java.util.Scanner;

public class PrimeNumber {
public Boolean primeNumber(int n) {
	if (n<=1) {
		return false;
	}
	else {
		for (int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}		
			
		}
		return true;
	}
}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
	
		int a = sc.nextInt();
		PrimeNumber p = new PrimeNumber();
		
		boolean q = p.primeNumber(a);
		System.out.println(q);
		

	}

}
