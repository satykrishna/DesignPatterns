package example.composite.pattern;

public class CoarseGrainedObject {

	private DependentObject1 do1;
	private DependentObject2 do2;

	public DependentObject1 getDo1() {
		return do1;
	}

	public void setDo1(DependentObject1 do1) {
		this.do1 = do1;
	}

	public DependentObject2 getDo2() {
		return do2;
	}

	public void setDo2(DependentObject2 do2) {
		this.do2 = do2;
	}

	public CoarseGrainedObject() {
		super();
		do1 = new DependentObject1();
		do2 = new DependentObject2();
	}
	
	public void setData(String data1, String data2) {
		do1.setData(data1);
		do2.setData(data2);
	}
	
	public String[] getData() {
		return new String[] {do1.getData(), do2.getData()};
	}

	
	
}
