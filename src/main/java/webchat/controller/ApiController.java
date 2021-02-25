package webchat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import webchat.model.User;
import webchat.model.Message;
import webchat.repository.MessageRepository;
import webchat.repository.UserRepository;
import webchat.service.MessageService;
import webchat.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class ApiController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	MessageRepository messageRepository;

	@Autowired
	UserService userService;

	@Autowired
	MessageService messageService;

	@GetMapping("/users") //  
	public ResponseEntity<Object> getUsers() {
		return userService.getUsers();  // chiamo il metodo del service che farà i controlli e mi restituirà quello che mi serve o un errore specifico
	}
    
	@PostMapping("/newUser") 
	public ResponseEntity<Object> insertUser(@RequestBody User usr){
		return userService.insertUser(usr);
	}
	
	@GetMapping("/messagesFromTo")
	@ResponseBody
	public ResponseEntity<Object> getMessages(@RequestParam int fromId, @RequestParam int toId){
		return messageService.getMessages(fromId,toId);
	}
	
	
	
	//@GetMapping("/messagesFromTo")
	//@ResponseBody
	//public List<Message> getAllMessagesFromTo(@RequestParam int fromId, @RequestParam int toId) {
	//	return messageRepository.findAllMessageFromTo(fromId, toId);
	//}

	@PostMapping("/submitMessageFromTo")
	public int insertMessage(@RequestBody Message msg) {
		return messageRepository.insert(msg);

	}
    // allMessages mi restituisce tutti i messaggi presenti nel DB, INUTILE
	// @GetMapping("/allMessages")
	// public List<Message> getAllMessages() {
	// return messageRepository.findAll();
	// }
}