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
		    user.setIdUser(rs.getLong("idUser"));
		    user.setName(rs.getString("Name"));
		    user.setEmail(rs.getString("Email"));
		    user.setBirthday(rs.getDate("Birthday"));
		    user.setNation(rs.getString("Nation"));
		    user.setStutusMessage(rs.getString("StutusMessage"));
		    return user;
			}
		}

    public List < User > findAll() {
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }



    public int insert(User user) {
        return jdbcTemplate.update("insert into user (idUser, Name, Email, Birthday, Nation, StutusMessage) " + "values(?, ?, ?, ?, ?, ?)",
            new Object[] {
                user.getIdUser(), user.getName(), user.getEmail(), user.getBirthday(), user.getNation(), user.getStutusMessage()
            });
    }

  
}