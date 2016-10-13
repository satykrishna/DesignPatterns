package example.memento.pattern;

import java.lang.management.MemoryManagerMXBean;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveMementoState() {
		return new Memento(state);
	}

	public Originator(String state) {
		super();
		this.state = state;
	}
	
	public Originator() {
		
	}
	
	public void getStateFromMemento(Memento memento ) {
		state = memento.getState();
	}

}
