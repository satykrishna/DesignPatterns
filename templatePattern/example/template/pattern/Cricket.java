package example.template.pattern;

public class Cricket extends Game {

	@Override
	public void intialize() {
		System.out.println("Initialize Cricket Game");
	}

	@Override
	public void startPlay() {
		System.out.println("Start playing Cricket Game");
	}

	@Override
	public void endPlay() {
		System.out.println("End Playing Cricket Game");
	}

}
