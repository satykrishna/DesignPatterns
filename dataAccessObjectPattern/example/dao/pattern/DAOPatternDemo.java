package example.dao.pattern;

public class DAOPatternDemo {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAOImpl();
		
		for(Student student : dao.getAllStudents()) {
			System.out.println(student);
		}
		
		dao.updateStudent(new Student(0, "Kaka"));
		
		for(Student student : dao.getAllStudents()) {
			System.out.println(student);
		}
		
		dao.deleteStudent(new Student(2, "Kondapalli"));
		
		for(Student student : dao.getAllStudents()) {
			System.out.println(student);
		}
	}
}
