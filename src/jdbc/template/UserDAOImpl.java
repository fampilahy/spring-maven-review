package jdbc.template;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAOImpl implements UserDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void createUser(User user) {
		String sql = "insert into user (first_name,last_name,email,pass) values (?,?,?,?)";
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getPass());
		System.out.println("Created user " + user.getEmail());
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
