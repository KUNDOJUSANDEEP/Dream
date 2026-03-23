package DailyCode;

import java.util.Scanner;

public class Fibinocci {
	
	public void fibinocci(int n) {
		if (n<1) {
			System.out.println("The Number is invalid");
			return;
		}
		int prev2=0;
		int prev1=1;
		
		System.out.print(prev2+" ");
		
		if (n==1)
			return;
		
			System.out.print(prev1+ " ");
		
		for (int i = 3;i<=n;i++) {
			int cur = prev1+prev2;
			System.out.print(cur+" ");
			prev2=prev1;
			prev1=cur;
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int y = sc.nextInt();
		
		Fibinocci f = new Fibinocci();
		
		f.fibinocci(y);

	}

}
