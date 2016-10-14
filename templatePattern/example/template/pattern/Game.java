package example.template.pattern;

public abstract class Game {
	
	public abstract void intialize();
	
	public abstract void startPlay();
	
	public abstract void endPlay();
	
	public final void play() {
		intialize();
		startPlay();
		endPlay();
	}

}
