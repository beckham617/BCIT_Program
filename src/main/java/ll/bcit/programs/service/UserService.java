package ll.bcit.programs.service;

import java.util.List;

import ll.bcit.programs.domain.User;

public interface UserService {

	List<User> listUser();
	
	void saveOrUpdate(User user);
}
