package webchat;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import webchat.model.User;
import webchat.repository.UserRepository;

@SpringBootApplication
public class App implements CommandLineRunner {
	
  
	@Autowired
	private UserRepository userrepository ; 
	
	public static void main(String[] args) {
		
             SpringApplication.run(App.class, args);
	         }

	public void run(String... args) throws Exception {
//		User user = new User(Long.valueOf(1),"Alberto","husjdhgs",Date.from(Instant.now()),"Italy","Tue ses unu ballaloi");
//		userrepository.insert(user);
//		
	}
}
