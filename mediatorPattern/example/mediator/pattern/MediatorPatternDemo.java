package example.mediator.pattern;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		User john = new User("John");
		User robert = new User("Robert");
		robert.sendMessage("Hi John");
		john.sendMessage("Hi Robert");
	}
	
}
