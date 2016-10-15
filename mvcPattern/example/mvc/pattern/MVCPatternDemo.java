package example.mvc.pattern;

public class MVCPatternDemo {
	
	public static void main(String[] args) {
		Student student = retriveFromDB();
		StudentView view = new StudentView();
		StudentController studentController = new StudentController(student, view);
		studentController.updateView();
		studentController.setStudentName("Kondapalli");
		studentController.updateView();
	}

    private static Student retriveFromDB() {
    	return new Student("156996", "Satyakrishna");
    }
}
