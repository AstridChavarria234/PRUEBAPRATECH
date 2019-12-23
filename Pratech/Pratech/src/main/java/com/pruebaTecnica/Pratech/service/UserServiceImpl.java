package com.pruebaTecnica.Pratech.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pruebaTecnica.Pratech.dao.IUserDao;
import com.pruebaTecnica.Pratech.entity.User;

@Service
public class UserServiceImpl  implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	
	@Override
	public boolean guardar(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user) != null; 
	}

	@Override
	public List<User> listarTodos() {
		// TODO Auto-generated method stub
		
		return (List<User>) userDao.findAll();
	}

	@Override
	
		public boolean buscarUser(String user, String password) {
			// TODO Auto-generated method stub
			try {
			for(User users:listarTodos()) {
				if(users.getNombre().equals(user) && users.getClave().equals(password))
					return true;
				else
					return false;
			}}catch(Exception e) {
			
		}
			return false;

	}
	
	
}
