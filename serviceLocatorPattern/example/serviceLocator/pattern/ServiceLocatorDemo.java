package example.serviceLocator.pattern;

public class ServiceLocatorDemo {


	public static void main(String[] args) {
		
		Service service = ServiceLocator.getSetvice("service1");
		service.execute();
	    service = ServiceLocator.getSetvice("service2");
		service.execute();
		service = ServiceLocator.getSetvice("service1");
		service.execute();
	    service = ServiceLocator.getSetvice("service2");
		service.execute();
	
	}
	
	
}
