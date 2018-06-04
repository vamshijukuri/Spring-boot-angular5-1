package com.devglan.userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin (   maxAge = 3600)
@RestController
@RequestMapping({ "/api" })
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	// @CrossOrigin
	public User create(@RequestBody User user) {
		System.out.println("Creating user");
		return userService.create(user);
	}

	// @CrossOrigin
	@GetMapping(path = { "/{id}" })
	public User findOne(@PathVariable("id") int id) {
		return userService.findById(id);
	}

	// @CrossOrigin
	@PutMapping
	public User update(@RequestBody User user) {
		return userService.update(user);
	}

	// @CrossOrigin
	@DeleteMapping(path = { "/{id}" })
	public User delete(@PathVariable("id") int id) {
		return userService.delete(id);
	}

	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}
}
