package example.transferObject.pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

	private List<StudentVO> students;

	public StudentBO() {
		super();
		students = new ArrayList<StudentVO>();
		students.add(new StudentVO("Satyakrishna", 0));
		students.add(new StudentVO("Kondapalli", 1));
	}

	public StudentVO delete(StudentVO studentVO) {
		System.out.println("Remove student : " + studentVO);
		StudentVO student = students.remove(studentVO.getRollNo());
		return student;
	}

	public List<StudentVO> getAllStudents() {
		System.out.println("GET STUDENTS : ");
		return students;
	}

	public StudentVO getStudent(int rollNo) {
		System.out.println("Get student : " + students.get(rollNo));
		return students.get(rollNo);
	}
	
	public void updateStudent(StudentVO student) {
		System.out.println("Update the student from "  + student);	
		StudentVO studentUpdate = students.get(student.getRollNo());
		studentUpdate.setName(student.getName());
		System.out.println("Update student to " + studentUpdate);
	}

}
