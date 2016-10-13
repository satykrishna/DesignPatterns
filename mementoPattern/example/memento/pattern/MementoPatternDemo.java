package example.memento.pattern;

public class MementoPatternDemo {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		Caretaker careTaker = new Caretaker();
		
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveMementoState());
		
		originator.setState("State #3");
		careTaker.add(originator.saveMementoState());
		
		originator.setState("State #4");
		
		System.out.println("Current state " + originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First Saved State is " + originator.getState());
		
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second Saved State is " + originator.getState());
		
	}
}
