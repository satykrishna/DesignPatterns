package example.dao.pattern;

import java.util.List;

public interface StudentDAO {

	public List<Student> getAllStudents();
	
	public Student getStudent(int rollNo);
	
	public int updateStudent(Student modifyStudent);
	
	public int deleteStudent(Student deleteStudent);
	
}
