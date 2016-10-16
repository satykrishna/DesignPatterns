package example.dao.pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
	
	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public int updateStudent(Student modifyStudent) {
		System.out.println("Modify the student : " + modifyStudent.getName());
		students.get(modifyStudent.getRollNo()).setName(modifyStudent.getName());
		return students.indexOf(modifyStudent);
	}

	@Override
	public int deleteStudent(Student deleteStudent) {
		System.out.println("Delete the student: " + deleteStudent.getName());
		return students.remove(deleteStudent.getRollNo()) == null? 0:1;
	}

	public StudentDAOImpl(List<Student> students) {
		super();
		this.students = students;
	}

	public StudentDAOImpl() {
		super();
		students = new ArrayList<Student>();
		students.add(new Student(0, "Satya"));
		students.add(new Student(1, "krishna"));
		students.add(new Student(2, "kondapalli"));
	}

}
