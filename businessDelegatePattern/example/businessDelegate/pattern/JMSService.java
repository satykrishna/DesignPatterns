package example.businessDelegate.pattern;

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing is done by JMS service");
	}

}
