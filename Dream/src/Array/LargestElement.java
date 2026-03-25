package Array;

import java.util.Scanner;

public class LargestElement {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		
		int [] list = new int[size];
		
		for(int i=0;i<size;i++) {
			list[i]=sc.nextInt();			
		}
		int big = 0;
		int sum = 0;
		for (int a:list) {
			System.out.print(a+" ");
			
			
			if(big<a) {
				big=a;				
			}
			
			sum+=a;
		
		}
		System.out.println();
		System.out.println("The Biggest Element is "+ big);
		System.out.println("The Sum of the Element is "+ sum);
		
		
		
		
		
		
		

	}

}
