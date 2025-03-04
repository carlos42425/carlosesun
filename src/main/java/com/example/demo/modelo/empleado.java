package com.example.demo.modelo;

import jakarta.persistence.*;


@Entity
@Table(name="empleados")



public class empleado {
@Id
@Column(name="identificador")
private long identificacion;

@Column(name="nombre", length=50, nullable=false)
private String nombre;

@Column(name="apellido", length=80, nullable=false)
private String apellido;

@Column(name="email", length=100, nullable=false, unique=true)
private String email;

public empleado() {
	super();
	// TODO Auto-generated constructor stub
}

public empleado(long identificacion, String nombre, String apellido, String email) {
	super();
	this.identificacion = identificacion;
	this.nombre = nombre;
	this.apellido = apellido;
	this.email = email;
}

public long getIdentificacion() {
	return identificacion;
}

public void setIdentificacion(long identificacion) {
	this.identificacion = identificacion;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}






	
}
