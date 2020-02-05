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


	//TODO
	// Implementar Capa de negocio
	// Implementar Trasas para seguimiento
	// Implementar seguridad -Datos en transito encriptados AES256-- para capa red SSL
	// Covertura >85 implementar pruebas unitarias

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
	public Users putUsers(@PathVariable("id") long id , @RequestBody Users body ){
		log.info("Begins putUsers");
		Users user =userRepository.findById(id).orElseThrow(
				IllegalArgumentException::new);


		user.setProcesado(true);
		user.setNombre(body.getNombre());
		user.setApellido(body.getApellido());

		Users usersList =userRepository.save(user);
		return usersList;
	}

}
