package example.observatory.pattern;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary Observer : " + Integer.toBinaryString(subject.getState()));
	}
	
	@Override
	public String toString() {
		return "Binary Observer";
	}

}
