package com.trabajoFinal.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class OrdenRepuesto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private int cantRepuestos;
	
	@ManyToOne(targetEntity=OrdenTrabajo.class)
	@JoinColumn(name="idOrdenTrabajo")
	private OrdenTrabajo orden;
	
	
	@ManyToOne(targetEntity=Repuesto.class)
	@JoinColumn(name="idRepuesto")
	private Repuesto repuesto;
	
	
	
	
	
	public OrdenRepuesto(){}


	public final Long getId() {
		return id;
	}


	public final void setId(Long id) {
		this.id = id;
	}


	public final int getCantRepuestos() {
		return cantRepuestos;
	}


	public final void setCantRepuestos(int cantRepuestos) {
		this.cantRepuestos = cantRepuestos;
	}


	public final OrdenTrabajo getOrden() {
		return orden;
	}


	public final void setOrden(OrdenTrabajo orden) {
		this.orden = orden;
	}


	public final Repuesto getRepuesto() {
		return repuesto;
	}


	public final void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}
	
	





}
