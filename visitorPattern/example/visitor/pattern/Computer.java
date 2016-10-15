package example.visitor.pattern;

public class Computer implements ComputerPart {

	private ComputerPart[] computerParts;
	
	public Computer() {
		setComputerParts(new ComputerPart[]{new Keyboard(), new Monitor(), new Mouse()});
	}
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for(int i = 0; i < computerParts.length; ++i) {
			computerParts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

	public ComputerPart[] getComputerParts() {
		return computerParts;
	}

	public void setComputerParts(ComputerPart[] computerParts) {
		this.computerParts = computerParts;
	}

}
