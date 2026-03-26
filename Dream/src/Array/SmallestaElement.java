package Array;

public class SmallestaElement {

	public static void main(String[] args) {
		int [] array = {4, 2, 9, 1,0};
		int a = array[0];
		for (int i=0;i<array.length;i++) {
			if (a>array[i]) {
				a=array[i];
			}
		}
		
		System.out.println("The Smallest number is "+ a);
		
	}

}
