package com.pruebaTecnica.Pratech.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaTecnica.Pratech.dao.IEmpleadoDao;
import com.pruebaTecnica.Pratech.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService  {

	@Autowired
	private IEmpleadoDao empleadoDao;
	
	
	@Override
	public Empleado guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.save(empleado);
	}

	@Override
	public List<Empleado> guardar(Empleado[] empleado) {
		// TODO Auto-generated method stub
		return (List<Empleado>) empleadoDao.saveAll(Arrays.asList(empleado));
	}

	@Override
	public boolean borrar(int id) {
		try {
		if(empleadoDao.findById((long) id) != null) {
			  empleadoDao.deleteById((long) id);
		return true;
		}
     
		}catch(Exception ex) {
			
		}
		return false;
		
	}

	@Override
	public Empleado buscarEmpleadoPorId(long id) {
		// TODO Auto-generated method stub
		return empleadoDao.findById((long) id).orElse(null);
	}

	@Override
	public List<Empleado> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Empleado>) empleadoDao.findAll();
		
	}
	


}
