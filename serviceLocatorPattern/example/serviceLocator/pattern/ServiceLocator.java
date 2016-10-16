package example.serviceLocator.pattern;

public class ServiceLocator {
	
	private static Cache cache;
	
	static {
		cache = new Cache();
	}
	
	public static Service getSetvice(String jndiName) {
		
		Service service = cache.getService(jndiName);
		
		if(service != null ) {
			return service;
		}
		
		InitialContext context  = new InitialContext();
		service = (Service) context.lookUp(jndiName);
		cache.addNewService(service);
		return service;
		
		
	}

}
