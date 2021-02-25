package webchat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import webchat.repository.MessageRepository;

@Service
public class MessageService {

	@Autowired
	MessageRepository messageRepository;
	
	public ResponseEntity<Object> getMessages(int fromId , int toId ) {
	if (true) {
		return new ResponseEntity<Object>( messageRepository.findAllMessageFromTo(fromId, toId) , HttpStatus.OK);
	}else {
		return new ResponseEntity<Object>("male male", HttpStatus.BAD_REQUEST);
	} 
	
	}


}
