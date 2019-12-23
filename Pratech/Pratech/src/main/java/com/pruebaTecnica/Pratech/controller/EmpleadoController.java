package com.pruebaTecnica.Pratech.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnica.Pratech.entity.Empleado;
import com.pruebaTecnica.Pratech.service.IEmpleadoService;


@RestController
@RequestMapping("/api")
public class EmpleadoController {

		@Autowired
		private IEmpleadoService empleadoService;
		
		@GetMapping("/empleado")
		public List<Empleado> listar(){
			return empleadoService.listarTodos();
		}
		
		@GetMapping("/empleado/{id}")
		public Empleado buscarPorId(@PathVariable int id ) {
			
			return empleadoService.buscarEmpleadoPorId(id);
		}
		
		@PostMapping("/empleado")
		public Empleado guardar (@RequestBody Empleado empleado) {//lo recibo en el body del request
			return empleadoService.guardar(empleado);
		}
		
		@PostMapping("/empleados")
		public List<Empleado> guardar (@RequestBody Empleado[] empleados) {
			return empleadoService.guardar(empleados);
		}
		
		@SuppressWarnings("unused")
		@PostMapping("/actualizarempleado")
		public Empleado actualizar(@RequestBody Empleado empleado) {
			
		
			
			Empleado empleadoActualizar= new Empleado();
			Empleado empleadoActual= empleadoService.buscarEmpleadoPorId(empleado.getId());
			empleadoActualizar.setId(empleado.getId());
			empleadoActualizar.setNombre(empleado.getNombre());
			empleadoActualizar.setApellido(empleado.getApellido());
			empleadoActualizar.setCargo(empleado.getCargo());
		    empleadoActualizar.setEstadoCivil(empleado.getEstadoCivil());
			empleadoActualizar.setEtnia(empleado.getEtnia());
			empleadoActualizar.setFechaNacimiento(empleado.getFechaNacimiento());
			
			return empleadoService.guardar(empleadoActualizar); 
			
		}
		
		@DeleteMapping("/empleado/{id}")
		public boolean borrar(@PathVariable int id) {
			
			return	empleadoService.borrar(id);
			
			
		}
	}


