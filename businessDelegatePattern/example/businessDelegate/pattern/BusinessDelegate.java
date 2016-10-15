package example.businessDelegate.pattern;

public class BusinessDelegate {

	private BusinessLookUp lookupService = new BusinessLookUp();
	private BusinessService service;
	public String serviceType;
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask() {
		service = lookupService.getService(serviceType);
		service.doProcessing();
	}
}
