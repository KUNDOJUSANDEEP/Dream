package DailyCode;

public class NumberLogic {

	private int sum;

	public int number(int x) {
		while (x>0) {
			int y = x%10;
			//int sum = 0;
			if(y%2==0) {
			
				sum+=y;
			}
			x=x/10;
		}
		
		return sum; 
	}
	
	public static void main(String[] args) {
		
NumberLogic n = new NumberLogic(); 

int q = n.number(878);
System.out.println(q);
	}

}
