package OOP;

public class Product {
      String name;
      int price;
      
      Product(String name, int price){
    	  this.name=name;
    	  this.price=price;
    	 
      }
      
      public void displayDetails() {
    	  System.out.println(name+" Has a "+price);
      }

	public static void main(String[] args) {
Product p = new Product("TV",123);
p.displayDetails();
	}

}
