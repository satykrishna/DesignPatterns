package example.composite.pattern;

public class Client {

	private CompositeEntity entity;

	public Client() {
		super();
		entity = new CompositeEntity();
	}

	public CompositeEntity getEntity() {
		return entity;
	}

	public void setEntity(CompositeEntity entity) {
		this.entity = entity;
	}
	
	public void setData(String data1, String data2) {
		entity.setData(data1, data2);
	}
	
	public void print(){
		String[] data = entity.getData();
		for(int i = 0; i < data.length; ++i) {
			System.out.println("Data : " + data[i]);
		}
	}
		
	
}
