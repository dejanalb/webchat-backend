package webchat.model;

import java.util.Date;

public class Message {
private int idMessage;
private int idMitt;
private int idDest;
private String text;
private Date dateTime;
	 
public Message(int idMessage, int idMitt, int idDest, String text, Date dateTime) {
super();
this.idMessage = idMessage;
this.idMitt = idMitt;
this.idDest = idDest;
this.text = text;
this.dateTime = dateTime;}

public Message() {}
			
public int getIdMessage() {
	return idMessage;
}

public void setIdMessage(int idMessage) {
	this.idMessage = idMessage;
}

public int getIdMitt() {
	return idMitt;
}

public void setIdMitt(int idMitt) {
	this.idMitt = idMitt;
}

public int getIdDest() {
	return idDest;
}

public void setIdDest(int idDest) {
	this.idDest = idDest;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public Date getDateTime() {
	return dateTime;
}

public void setDateTime(Date dateTime) {
	this.dateTime = dateTime;
}
		
}
	            
	 
	 
	 
