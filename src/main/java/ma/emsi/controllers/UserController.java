package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.User;
import ma.emsi.services.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(value = "/save")
	public User save(User object) {
		return userService.save(object);
	}
	
	@PutMapping(value = "/update")
	public User update(User object) {
		return userService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(User object) {
		userService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public User findById(int id) {
		return userService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	


	
	

}
