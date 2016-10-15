package example.visitor.pattern;

public interface ComputerPartVisitor {

	public abstract void visit(Computer computer);
	
	public abstract void visit(Keyboard keyboard);
	
	public abstract void visit(Monitor monitor);
	
	public abstract void visit(Mouse mouse);
}
