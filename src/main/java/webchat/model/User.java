package webchat.model;

import java.util.Date;

public class User {
private Long idUser;
private String Name;
private String Email;
private Date Birthday;
private String Nation;
private String StutusMessage;

public User() {}

public User(Long idUser, String name, String email, Date birthday, String nation, String statusMessage) {
	super();
	this.idUser = idUser;
	Name = name;
	Email = email;
	Birthday = birthday;
	Nation = nation;
	StutusMessage = statusMessage;
	}

public Long getIdUser() {
	return idUser;
}

public void setIdUser(Long idUser) {
	this.idUser = idUser;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public Date getBirthday() {
	return Birthday;
}

public void setBirthday(Date birthday) {
	Birthday = birthday;
}

public String getNation() {
	return Nation;
}

public void setNation(String nation) {
	Nation = nation;
}

public String getStutusMessage() {
	return StutusMessage;
}

public void setStutusMessage(String statusMessage) {
	StutusMessage = statusMessage;
}






}



