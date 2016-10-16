package example.intercepter.pattern;

public class IntercepterFilterPatternDemo {

	public static void main(String[] args) {
		
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebuggingFilter());
		
		Client client = new Client();
		
		client.setFilterManager(filterManager);
		
		client.sendRequest("HOME");
		
		
		
	}
}
