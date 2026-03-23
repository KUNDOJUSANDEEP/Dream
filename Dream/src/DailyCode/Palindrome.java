package DailyCode;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number : ");
int x = sc.nextInt();
int y=x;
int rev = 0;
int lb = 0;
while(x>0) {
	lb = x%10;
	rev = rev*10+lb;
	x=x/10;
}

//System.out.println(rev  +" "+ y);

if (y==rev) {
	System.out.println("The Number "+y+" is Palindrome");
}
else {
 System.out.println("The Number "+y+" is not Palindrome");  
}

	}

}
