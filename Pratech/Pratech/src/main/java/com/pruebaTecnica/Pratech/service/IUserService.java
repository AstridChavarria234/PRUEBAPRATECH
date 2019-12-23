package com.pruebaTecnica.Pratech.service;

import java.util.List;

import com.pruebaTecnica.Pratech.entity.User;



public interface IUserService {
	
   public boolean guardar (User user);
   public boolean buscarUser (String user,String password);	
   public List<User> listarTodos ();

	
	
}
