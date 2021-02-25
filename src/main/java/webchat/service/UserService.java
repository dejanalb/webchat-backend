package webchat.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import webchat.model.User;
import webchat.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public ResponseEntity<Object> userNow() {

		if (true) {
			return new ResponseEntity<Object>(userRepository.findAll(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>("male", HttpStatus.BAD_REQUEST);
		}

	 } 
	public ResponseEntity<Object> insertUser(User usr){
		if (true) {
			return new ResponseEntity<Object>(userRepository.insert(usr), HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Object>("male male", HttpStatus.BAD_REQUEST);
		}
	}

}
