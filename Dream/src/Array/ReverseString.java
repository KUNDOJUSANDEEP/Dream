package Array;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word : ");
		String x = sc.nextLine();
		char [] a = x.toCharArray();
		
		System.out.println(a.length);
		
		int start=0;
		int end=a.length-1;
		while(start<end) {
			char temp;
			temp=a[start];
			a[start++]=a[end];
			a[end--]=temp;
				
		}
		
		System.out.println(a);
		
       String y=String.valueOf(a);
		if (y.equalsIgnoreCase(x)) {
			System.out.println("Yes Palindrom");
		}
		else System.out.println("Not Palindrom");
	}

}
