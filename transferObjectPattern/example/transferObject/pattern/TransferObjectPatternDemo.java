package example.transferObject.pattern;

public class TransferObjectPatternDemo {

	public static void main(String[] args) {
		StudentBO studentBO = new StudentBO();

		for (StudentVO studentVO : studentBO.getAllStudents()) {
			System.out.println(studentVO);
		}

		StudentVO studentVO = new StudentVO("MICHAEL", 0);

		studentBO.updateStudent(studentVO);

		studentBO.delete(studentVO);

		for (StudentVO student : studentBO.getAllStudents()) {
			System.out.println(student);
		}

	}
}
