package example.observatory.pattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		
		Subject subject = new Subject();
		
		new HexaObserver(subject);
		
		new OctalObserver(subject);
		
		new BinaryObserver(subject);
		
		System.out.println("First change : " + 15);
		
		subject.setState(15);
		
		System.out.println("Second change  :  " + 10 );

		subject.setState(10);

		
	}
	
}
