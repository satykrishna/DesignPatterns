package example.strategy.pattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(2, 3));
		
		context.setStrategy(new OperationMultiply());
		System.out.println(context.executeStrategy(2, 3));
		
		context.setStrategy(new OperationDivision());
		System.out.println(context.executeStrategy(2, 3));
		
		context.setStrategy(new OperationSubstract());
		System.out.println(context.executeStrategy(2, 3));
		
		
	}
	
}
