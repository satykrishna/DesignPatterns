package example.serviceLocator.pattern;

public class InitialContext {

	public Object lookUp(String jndiName) {
		
		if(jndiName.equalsIgnoreCase("Service1")) {
			System.out.println("Looking up and creating a new Sevice 1 object");
			return new Service1();
		}
		else if(jndiName.equalsIgnoreCase("Service2")) {
			System.out.println("Looking up and creating a new Service 2 object");
			return new Service2();
		}
		
		return null;
	}
}
