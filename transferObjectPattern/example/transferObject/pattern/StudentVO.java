package example.transferObject.pattern;

public class StudentVO {

	private String name;
	private int rollNo;

	public StudentVO() {
		super();
	}

	public StudentVO(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student : {\n 'name' : '" + name + "', \n 'rollNo' : '" + rollNo+"'\n}";
	}

}
