package example.mediator.pattern;

public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(String message) {
		ChatRoom.sendMessage(this, message);
	}
	
	public User(String name ) {
		this.name = name;
	}
}
