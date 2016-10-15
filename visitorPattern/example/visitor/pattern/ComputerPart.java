package example.visitor.pattern;

public interface ComputerPart {

	
	public abstract void accept(ComputerPartVisitor computerPartVisitor);
	
}
