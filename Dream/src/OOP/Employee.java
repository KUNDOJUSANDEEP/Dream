package OOP;

public class Employee {

	String name;
	int salary;
	
	public void setDetails(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println(name+" Has a Salary of "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee();
e.setDetails("Sandeep", 150000);
e.displayDetails();
	}

}
