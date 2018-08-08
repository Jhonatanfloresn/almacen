package com.almacen.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persona")
@Access(AccessType.FIELD)
public class Persona extends ParentEntity{

	private static final long serialVersionUID = -4376099711242203274L;
	
	@Column(name="dni", nullable=false,length=8)
	private String dni;
	
	@Column(name="nombres", nullable=false,length=255)
	private String nombres;
	
	@Column(name="apellidos", nullable=false,length=255)
	private String apellidos;
	
	@Column(name="direccion", nullable=true,length=255)
	private String direccion;
	
	@Column(name="telefono", nullable=true,length=10)
	private String telefono;
	
	@Column(name="email", nullable=true,length=50)
	private String email;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
