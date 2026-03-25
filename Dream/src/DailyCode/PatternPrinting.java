package DailyCode;

public class PatternPrinting {

	public void pattern(int n) {
		for (int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PatternPrinting p = new PatternPrinting();
		p.pattern(3);
	}

}
