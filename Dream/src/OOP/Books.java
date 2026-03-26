package OOP;

public class Books {
	String title;
	String author;
	int price;
	
	public void setDetails(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	
	public void displayDetails() {
		System.out.println("The book "+ title + "is written by " +author+ " and the price is "+price );
	}

	public static void main(String[] args) {
		Books a = new Books();
		a.setDetails("Money", "sandeep", 100);
		Books b = new Books();
		b.setDetails("Honey", "kundoju", 200);

		a.displayDetails();
		b.displayDetails();
	}

}
