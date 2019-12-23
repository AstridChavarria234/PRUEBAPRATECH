package com.pruebaTecnica.Pratech.dao;
import org.springframework.data.repository.CrudRepository;

import com.pruebaTecnica.Pratech.entity.Empleado;


public interface IEmpleadoDao extends CrudRepository <Empleado, Long> {

}
