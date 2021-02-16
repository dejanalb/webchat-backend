package webchat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import webchat.model.User;
	
	@RestController
	@RequestMapping("/api/")
	public class ApiController {
		
		@GetMapping("/users")
		public List<User> getAllUsers() {
			User user1 = new User("Alberto","afadf@gmail.com");
		    User user2 = new User();
		    user2.setName("Roberto");
		    user2.setEmail("adga@gmail.com");
		    
		    List<User> list = new ArrayList<User>();
		    list.add(user1);
		    list.add(user2);
			return list;
		}
		
		@GetMapping("/users/{id}")
		public User getUserById(@PathVariable String id ) {
			User user1 = new User();
			user1.setName("Roberto");
			user1.setEmail("Gianni");
			return user1;
		}
		
		@GetMapping("/users/par") 
		public User getUserByIdPar(@RequestParam String fromid,  @RequestParam String toid ) {
			User user1 = new User();
			user1.setName("Roberto");
			user1.setEmail("Gianni");
			return user1;
		}
		
		@PostMapping("/users/par")
		public User getUserByIdPar(@RequestBody User user) {
			User user1 = new User();
			user1.setName("Roberto");
			user1.setEmail("Gianni");
			return user1;
		}

	}