package DailyCode;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word :");
		String s = sc.nextLine();
		String trimmed = s.replaceAll("\\s+","");
		System.out.println(trimmed);
	}

}
