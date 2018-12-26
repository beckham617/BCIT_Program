package ll.bcit.programs.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ll.bcit.programs.domain.User;
import ll.bcit.programs.service.UserService;

@Controller
public class UserController {

	private static final Logger log = LogManager.getLogger(UserController.class);
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/")
    public String redirToList(){
        return "redirect:user/list";
    }
	
	@RequestMapping(value={"/user/list","/user"},method=RequestMethod.GET)
	public String listUser(Model model) {
		model.addAttribute("users", userService.listUser());
		return "../pages/user/userList";
	}
	
	//redirect to new user page
	@RequestMapping(value = "/user/new", method = RequestMethod.GET)
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "../pages/user/userEdit";
	}
	
	//add new user
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String addUser(@Valid User user) {
		userService.saveOrUpdate(user);
		return "redirect:/user/list";
	}
}
