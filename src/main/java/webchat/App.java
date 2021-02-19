package webchat;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import webchat.model.Message;
import webchat.model.User;
import webchat.repository.MessageRepository;
import webchat.repository.UserRepository;

@SpringBootApplication
public class App implements CommandLineRunner {
	
  
	@Autowired
	private UserRepository userrepository ; 
	
	@Autowired
	private MessageRepository messagerepository ;
	
	public static void main(String[] args) {
		
             SpringApplication.run(App.class, args);
	         }

	public void run(String... args) throws Exception {
		//User user = new User(Long.valueOf(20),"Alberto","husjdhgs",Date.from(Instant.now()),"Italy","Tue ses unu ballaloi");
		//userrepository.insert(user);
		//User user2 = new User("Alberto","husjdhgs",Date.from(Instant.now()),"Italy","utente inserito con autoincremento id");
		//userrepository.insert(user2);		
		//Message msg= new Message(2,3,"primo messaggio salvato con autoincremento id",Date.from(Instant.now())); 
		//messagerepository.insert(msg);
		
	}
}
