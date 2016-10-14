package example.nullObject.pattern;

public class RealCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}
	
	public RealCustomer(String name) {
		super(name);
	}

}
