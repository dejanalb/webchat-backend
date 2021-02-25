package webchat.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import webchat.model.User;

@Repository
public class UserRepository {
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	class UserRowMapper implements RowMapper < User > {

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
		    user.setIdUser(rs.getLong("idUser")); //rs.getTipo("nomeColonna" indistintamente maiuscolo o minuscolo , esattamente il nome della colonna del db) 
		    user.setName(rs.getString("name"));
		    user.setEmail(rs.getString("email"));
		    user.setBirthday(rs.getDate("birthday"));
		    user.setNation(rs.getString("nation"));
		    user.setStatusMessage(rs.getString("statusMessage"));
		    return user;
			}
	}

    public List <User> findAll() {
        return jdbcTemplate.query("select * from User", new UserRowMapper() );
    }

    public int insert(User user) {
        return jdbcTemplate.update("insert into user (idUser, name, email, birthday, nation, statusMessage) " + "values(?, ?, ?, ?, ?, ?)", 
            new Object[] {user.getIdUser(), user.getName(), user.getEmail(), user.getBirthday(), user.getNation(), user.getStatusMessage()});
    }

}

  
