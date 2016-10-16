package example.intercepter.pattern;

public class DebuggingFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Debugging Filter !!!  " + request );
	}

}
