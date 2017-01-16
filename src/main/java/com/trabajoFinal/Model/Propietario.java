package com.trabajoFinal.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class Propietario {


	
	//Cuando no es AUTO_INCREMENT, ESTO NO VA ! ->@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long dni;
	
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	
	
	@OneToMany(mappedBy="prop",fetch=FetchType.EAGER)
	private List<OrdenTrabajo> listaOrdenTrabajo = new ArrayList<OrdenTrabajo>(); 
	
	
	
	
	
	
	
	public Propietario(){}
	
	
	
	public final Long getDni() {
		return dni;
	}



	public final void setDni(Long dni) {
		this.dni = dni;
	}
	

	
	public final List<OrdenTrabajo> getListaOrdenTrabajo() {
		return listaOrdenTrabajo;
	}

	public final void setListaOrdenTrabajo(List<OrdenTrabajo> listaOrdenTrabajo) {
		this.listaOrdenTrabajo = listaOrdenTrabajo;
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
	
	
	
	
	
	
	






}
