package example.template.pattern;

public class TemplatePatternDemo {

	
	public static void main(String[] args) {
		
		Game cricket = new Cricket();
		
		cricket.play();
		
		System.out.println();
		
		Game footBall = new Football();
		
		footBall.play();
	}
}
