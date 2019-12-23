package com.pruebaTecnica.Pratech.entity;



import javax.persistence. *;

@Entity
@Table(name="Users")
public class User {
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
   private  long Consec; 
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Clave")
	private String clave;
     
	@Column(name="Email")
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public long getConsec() {
		return Consec;
	}

	public void setConsec(long consec) {
		this.Consec = consec;
	}
	
	

}
