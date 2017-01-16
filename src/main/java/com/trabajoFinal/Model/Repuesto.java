package com.trabajoFinal.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Proxy;


@Entity
@Proxy(lazy=false)
public class Repuesto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private int stock;
	private int precio;



	@OneToMany(targetEntity=OrdenRepuesto.class,mappedBy="repuesto",fetch=FetchType.EAGER)
	private List<OrdenRepuesto> listaOrdenRepuesto = new ArrayList<OrdenRepuesto>();
	
	
	
	
	
	
	
	public Repuesto(){}
	
	
	public Long getId() {
		return id;
	}



	public final List<OrdenRepuesto> getListaOrdenRepuesto() {
		return listaOrdenRepuesto;
	}


	public final void setListaOrdenRepuesto(List<OrdenRepuesto> listaOrdenRepuesto) {
		this.listaOrdenRepuesto = listaOrdenRepuesto;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}


	
	
	
	

}
