package ll.bcit.programs.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ll.bcit.programs.controller.UserController;
import ll.bcit.programs.domain.User;
import ll.bcit.programs.repository.UserRepository;

/**
 * @author Liang Li
 *
 */
@Service
public class UserServiceImpl implements UserService{

	private static final Logger log = LogManager.getLogger(UserServiceImpl.class);
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<User> listUser(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	@Override
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}
}
