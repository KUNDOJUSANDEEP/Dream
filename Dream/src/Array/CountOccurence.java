package Array;

public class CountOccurence {

	public static void main(String[] args) {
		int [] array = {1, 2, 3, 2, 5,2, 5};
		int a = 2;
		int count = 0;
		for (int i = 0; i<array.length; i++) {
			if(array[i]==a) {
				count ++;
			}
		}
System.out.println("The Number is present "+ count +" Times");
	}

}
