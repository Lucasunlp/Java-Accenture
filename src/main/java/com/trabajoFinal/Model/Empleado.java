package com.trabajoFinal.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Proxy;



@Entity
@Proxy(lazy=false)
public class Empleado {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private String apellido;
	private String telefono;
	
	@OneToMany(mappedBy="e",fetch=FetchType.EAGER)
	private List<OrdenTrabajo> listaOrdenTrabajo = new ArrayList<OrdenTrabajo>();

	
	
	
	public Empleado(){}

	public  List<OrdenTrabajo> getListaOrdenTrabajo() {
		return listaOrdenTrabajo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public  void setListaOrdenTrabajo(List<OrdenTrabajo> listaOrdenTrabajo) {
		this.listaOrdenTrabajo = listaOrdenTrabajo;
	}




	public Long getId() {
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


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	
}
