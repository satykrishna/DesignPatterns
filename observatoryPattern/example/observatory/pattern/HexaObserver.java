package example.observatory.pattern;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hexa Observer : " + Integer.toHexString(subject.getState()));
	}

	@Override
	public String toString() {
		return "Hexa Observer";
	}
}
