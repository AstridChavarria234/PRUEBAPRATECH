package com.pruebaTecnica.Pratech.dao;

import org.springframework.data.repository.CrudRepository;


import com.pruebaTecnica.Pratech.entity.User;

public interface IUserDao extends CrudRepository <User, Long> {

}
