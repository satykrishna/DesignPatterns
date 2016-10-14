package example.nullObject.pattern;

public class CustomerFactory {

	public static final String[] names = new String[] { "Rob", "Julie", "Joe" };

	public static AbstractCustomer getCustomer(String name) {

		for (String eachName : names) {
			if (eachName.equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}

		return new NullCustomer(name);
	}

}
