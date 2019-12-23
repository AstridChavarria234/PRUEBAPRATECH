package com.pruebaTecnica.Pratech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnica.Pratech.entity.Empleado;
import com.pruebaTecnica.Pratech.entity.User;
import com.pruebaTecnica.Pratech.service.IEmpleadoService;
import com.pruebaTecnica.Pratech.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/list")
	public List<User> listar(){
		return userService.listarTodos();
	}
	
	@GetMapping("/user/{user}/{password}")
	public boolean buscar(@PathVariable String user, @PathVariable String password ) {
		
		return userService.buscarUser(user, password);
	}
	
	@PostMapping("/userguardar")
	public boolean guardar(@PathVariable User u) {	
		return userService.guardar(u);	
	}
}
