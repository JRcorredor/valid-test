package com.test.valid.controllers;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.test.valid.model.Users;
import com.test.valid.repositories.UsersRepository;

@Slf4j
@RequestMapping("/users")
@RestController
public class UsersController {
	
	private UsersRepository userRepository;

	
	@Autowired
	public UsersController(UsersRepository userRepository) {
		this.userRepository = userRepository;
		
	}
		
	@CrossOrigin("*")
	@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Users> getUsers(){
		log.info("Begins  getUsers");
		List<Users> usersList =userRepository.findAll();
		return usersList;
	}


	@CrossOrigin("*")
	@PostMapping( produces = MediaType.APPLICATION_JSON_VALUE  ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Users postUsers(@RequestBody Users body){
		log.info("Begins postUsers");
		Users usersList =userRepository.save(body);
		return usersList;
	}


	@CrossOrigin("*")
	@PutMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Users> putUsers(@PathVariable("id") List id , @RequestBody Users body ){
		log.info("Begins putUsers");
		List<Users> user =userRepository.findAllById(id).orElseThrow(
				IllegalArgumentException::new);
		//Users usersList =userRepository.save(user);
		return user;
	}

}
