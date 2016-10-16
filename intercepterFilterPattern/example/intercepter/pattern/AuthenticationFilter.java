package example.intercepter.pattern;

public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Executing authentication filter: " +request);
	}

}