package example.nullObject.pattern;

public class NullPatternDemo {

	public static void main(String[] args) {
		
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("satya");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Joe");
		
		System.out.println("customers = ");
		
		System.out.println(customer1.getName());
		
		System.out.println(customer2.getName());
		
		System.out.println(customer3.getName());
		
	}
	
}
