package Array;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Size of array");
int size = sc.nextInt();
int [] array = new int[size];

for (int i = 0; i<size;i++) {
	array[i]=sc.nextInt();
	}

int big=0;
int secbig=0;

for(int a:array) {
	if(a>big||a>secbig) {
		if(a>big) {
		secbig=big;
		big=a;
		}
		else
		secbig=a;
	}
	
	
}
System.out.println("The second largest number is : "+secbig);




	}

}
