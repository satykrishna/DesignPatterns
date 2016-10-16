package example.frontController.Pattern;

public class FrontControllerDemo {
	
	public static void main(String[] args) {
		
		FrontController controller = new FrontController();
		controller.dispatchRequest("Student");
		controller.dispatchRequest("home");
	}

}
