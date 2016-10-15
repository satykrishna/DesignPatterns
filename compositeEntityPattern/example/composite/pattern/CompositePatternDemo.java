package example.composite.pattern;

public class CompositePatternDemo {

	public static void main(String[] args) {
	
		Client client = new Client();
		client.setData("Test1", "Test2");
		client.print();
		
		client.setData("Data1", "Data2");
		client.print();
	}
	
}
