package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

//import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
	int a [] = {1, 2, 3, 4, 2, 1, 3 };
	
	ArrayList <Integer> list = new ArrayList<>();
	for (int i = 0; i<a.length;i++) {
	
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				if(!list.contains(a[j])) {
					list.add(a[j]);
					
					
				}
			}
		
	}
	
		
	}
	System.out.println(list);
	System.out.println("Completed");
	}
	
}
