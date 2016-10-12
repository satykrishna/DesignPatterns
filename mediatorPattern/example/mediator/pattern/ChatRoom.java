package example.mediator.pattern;

import java.util.Date;

public class ChatRoom {

	public static void sendMessage(User user, String message) {
         System.out.println("Message : " + new Date().toString() + " " + user.getName() 
         + ":= " + message);		
	}
	
	

}
