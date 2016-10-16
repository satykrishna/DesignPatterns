package example.frontController.Pattern;

public class Dispatcher {

	private HomeView homeView;
	private StudentView studentView;

	public Dispatcher() {
		super();
		homeView = new HomeView();
		studentView = new StudentView();
	}

	public Dispatcher(HomeView homeView, StudentView studentView) {
		super();
		this.homeView = homeView;
		this.studentView = studentView;
	}

	public HomeView getHomeView() {
		return homeView;
	}

	public void setHomeView(HomeView homeView) {
		this.homeView = homeView;
	}

	public StudentView getStudentView() {
		return studentView;
	}

	public void setStudentView(StudentView studentView) {
		this.studentView = studentView;
	}
	
	public void dispatch(String request){
		if(request.equalsIgnoreCase("Student")) {
			studentView.show();
		}
		else {
			homeView.show();
		}
	}

}
