package example.serviceLocator.pattern;

public class Service1 implements Service {

	@Override
	public String getName() {
		return "Service 1";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service 1");
	}

}
