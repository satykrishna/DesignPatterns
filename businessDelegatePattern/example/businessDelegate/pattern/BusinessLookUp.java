package example.businessDelegate.pattern;

public class BusinessLookUp {
	
	public BusinessService getService(String serviceType ) {
		
		if(serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		}
		
		else {
			return new JMSService();
		}
	}

}
