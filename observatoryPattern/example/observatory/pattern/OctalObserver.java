package example.observatory.pattern;

public class OctalObserver extends Observer {
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal Observer : " + Integer.toOctalString(subject.getState()));
	}
	
	@Override
	public String toString() {
		return "Octal Observer";
	}

}
