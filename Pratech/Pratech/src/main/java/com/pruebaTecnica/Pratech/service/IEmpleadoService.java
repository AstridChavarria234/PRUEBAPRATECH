package com.pruebaTecnica.Pratech.service;

import com.pruebaTecnica.Pratech.entity.Empleado;

import java.util.List;

public interface IEmpleadoService {
	
public Empleado guardar (Empleado empleado);
	
	public List<Empleado> guardar (Empleado[] empleado);
	
	public boolean borrar (int id);
	
	public Empleado buscarEmpleadoPorId (long l);
	
	public List<Empleado> listarTodos ();




}
