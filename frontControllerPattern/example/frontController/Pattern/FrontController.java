package example.frontController.Pattern;

public class FrontController {

	private Dispatcher dispatcher;

	public FrontController(Dispatcher dispatcher) {
		super();
		this.dispatcher = dispatcher;
	}

	public Dispatcher getDispatcher() {
		return dispatcher;
	}

	public void setDispatcher(Dispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}

	public FrontController() {
		super();
		dispatcher = new Dispatcher();
	}
	
	private boolean isAuthenticated() {
		System.out.println("User authenticated successfully");
		return true;
	}
	
	private void trackRequest(String request) {
		System.out.println("page requested : " + request);
	}
	
	public void dispatchRequest(String request) {
		trackRequest(request);
		
		if(isAuthenticated()) {
			dispatcher.dispatch(request);
		}
	}
	
}
