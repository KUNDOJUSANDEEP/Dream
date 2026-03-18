package DailyCode;

import java.util.Scanner;

public class Code3_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the number : ");
		for (int i =0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		
		//to find big number
		int big = 0;
		for(int j = 0; j<size;j++) {
			if(a[j]>big) {
				big=a[j];
			}
		}
	
		System.out.println("The Highest Number is "+ big);
	
	}

}
