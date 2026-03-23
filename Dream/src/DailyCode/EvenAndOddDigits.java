package DailyCode;

import java.util.Scanner;

public class EvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number : ");
int x= sc.nextInt();
int even = 0;
int odd = 0;
int lb = 0;

while (x>0) {
lb=x%10;
if(lb%2==0) {
	even+=1;
}
else {
	odd+=1;
}
x=x/10;
}


System.out.println("The Number of Even Numbers are "+ even);

System.out.println("The Number of odd Numbers are "+ odd);


	}

}
