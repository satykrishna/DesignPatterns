package example.nullObject.pattern;

public abstract class AbstractCustomer {
	
	protected String name;
	
	public abstract boolean isNil();
	
	public abstract String getName();
	
	public AbstractCustomer(String name) {
		this.name = name;
	}

}
