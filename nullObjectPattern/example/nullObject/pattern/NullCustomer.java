package example.nullObject.pattern;

public class NullCustomer extends AbstractCustomer {

	public NullCustomer(String name) {
		super(name);
	}

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "doesn't exist in the system";
	}

}
