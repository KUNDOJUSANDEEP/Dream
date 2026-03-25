package Array;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word : ");
	    String s = sc.nextLine();
	    
	    char [] array = s.toLowerCase().toCharArray();
	    int count=0;
	    for ( char a: array ) {
	    	if(a =='a'|| a =='e' || a =='i' || a =='o' || a =='u') {
	    		count++;
	    	}
	    }
	    
	    System.out.println(count);
	    
	
		

	}

}
