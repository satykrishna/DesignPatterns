package example.businessDelegate.pattern;

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Service Processed by EJBService");
	}

}
