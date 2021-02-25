package webchat.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import webchat.model.Message;


@Repository
public class MessageRepository {
     
	@Autowired
     JdbcTemplate jdbcTemplate;
     
	class MessageRowMapper implements RowMapper <Message> {  //mi serve per mappare il db
		
		    public Message mapRow(ResultSet rs, int rowNum) throws SQLException {    //metodo mapRow( mapRow è metodo di RowMapper, per questo faccio si che la classe MessageRowMapper sia implements di RowMapper) che restituisce un tipo message 
			Message message = new Message();
			message.setIdMessage(rs.getInt("idMessage"));
			message.setIdMitt(rs.getInt("idMitt"));
			message.setIdDest(rs.getInt("idDest"));
			message.setDateTime(rs.getDate("dateTime"));
			message.setText(rs.getString("text"));
		    return message;
		    } 
		}
	
	//provo a chiedere tutti i messaggi inviati da un determinato utente
	//public List <Message> find(int id) { 
	//	
	//	return jdbcTemplate.query("Select * from Message where idMitt = id  ", new MessageRowMapper() );
	//}
	
	
	public int insert(Message msg) {
			 return jdbcTemplate.update("insert into Message (idMessage, idMitt, idDest, dateTime, text) " + "values(?, ?, ?, ?, ?)", 
			                            new Object[] { msg.getIdMessage(), msg.getIdMitt(), msg.getIdDest(), msg.getDateTime(), msg.getText() });	
			 
			}
	
	
	
    //metodo per query che mi restituisce tutti i messaggi tra 2 utenti 
	public List<Message> findAllMessageFromTo(int id1 , int id2) {
		 return jdbcTemplate.query("Select * from Message where (idMitt= ? and idDest= ? ) or (idMitt= ? and idDest= ? ) order by dateTime ", new Object[]{id1,id2,id2,id1}  , new MessageRowMapper());
		 
		 }
	
	
	public List< Message > findAll() {
		 return jdbcTemplate.query("select * from Message" , new MessageRowMapper() );
		 
		 }
		
}




