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
			message.setDateTime(rs.getDate("dateTime"));
			message.setText(rs.getString("text"));
		    return message;
		    } 
		}
	public List <Message> find(int id) { //provo a chiedere tutti i messaggi inviati da un determinato utente
		
		return jdbcTemplate.query("Select * from Message where idMitt = id  ", new MessageRowMapper() );
	} 
	

}




