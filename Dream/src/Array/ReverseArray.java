package Array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array Size : ");
	int size = sc.nextInt();
	int []array=new int[size];
	for (int i = 0;i<size;i++) {
		array[i]=sc.nextInt();
	}
	
	int start = 0;
	int end = array.length-1;
	int temp;
	
	while(start<end) {
		temp = array[start];
		array[start++]=array[end];
		array[end--]=temp;
	}
	
	for(int a: array) {
		System.out.print(a);
	}
	
	}

}
