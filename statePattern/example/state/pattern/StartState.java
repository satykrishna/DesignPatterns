package example.state.pattern;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
       context.setState(this);
	}
	
	@Override
	public String toString() {
		return "Start state";
	}

}
