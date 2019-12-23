package com.pruebaTecnica.Pratech.entity;
import javax.persistence. *;
import javax.validation.constraints.NotNull;

	@Entity
	@Table(name="Empleado")
   public class Empleado {

		@Id
		@Column(name="Id")
		@NotNull
	private long id;
	
	@Column(name="Nombre", length=30)
	private String nombre;
	
	@Column(name="Apellido", length = 50)
	private String apellido;
	
	@Column(name="Cargo", length=30)
	private String cargo;
	
	@Column(name="EstadoCivil",  length=10)
	private String estadoCivil;
	
	
	@Column(name="FechaNacimiento", length=100)
	private String fechaNacimiento;
	
	@Column(name="Etnia", length= 20)
	private String etnia;
		
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getEtnia() {
		return etnia;
	}
	
	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public Empleado(@NotNull int id, String nombre, String apellido, String cargo, String estadoCivil,
			String fechaNacimiento, String etnia) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.etnia = etnia;
	}

	public Empleado() {
		
	}


}
