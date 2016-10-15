package example.composite.pattern;

public class CompositeEntity {
	
	
	private CoarseGrainedObject cgo;

	public CompositeEntity(CoarseGrainedObject cgo) {
		this.cgo = cgo;
	}

	public CompositeEntity() {
		super();
		cgo = new CoarseGrainedObject();
	}
	
	public void setData(String data1, String data2) {
		cgo.setData(data1, data2);
	}
	
	public String[] getData() {
		return cgo.getData();
	}

	public CoarseGrainedObject getCgo() {
		return cgo;
	}

	public void setCgo(CoarseGrainedObject cgo) {
		this.cgo = cgo;
	}

}
