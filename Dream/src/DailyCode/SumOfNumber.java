package DailyCode;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number : ");
long x = sc.nextLong();
int sum = 0;

while (x>0) {

	sum+=x%10;
	x=x/10;
}
System.out.println("The Sum is "+ sum);

	}

}
