package example.template.pattern;

public class Football extends Game {

	@Override
	public void intialize() {
		System.out.println("Initialize Football Game");
	}

	@Override
	public void startPlay() {
		System.out.println("start playing football game");
	}

	@Override
	public void endPlay() {
		System.out.println("End playing football game");
	}

}
