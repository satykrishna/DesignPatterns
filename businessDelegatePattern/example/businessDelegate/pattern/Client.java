package example.businessDelegate.pattern;

public class Client {

	private BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}
	
	public void doTask() {
		businessService.doTask();
	}
	
}
