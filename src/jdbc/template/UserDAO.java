package jdbc.template;

import java.util.List;

public interface UserDAO {

	public void deleteUser(User user);

	public void updateUser(User user);

	public User findUser(Integer id);

	public List<User> listUsers();

	void createUser(User user);

}
