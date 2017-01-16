package com.trabajoFinal.Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class OrdenTrabajo {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String patente;
	private String marca;
	private String modelo;
	private Date fecha;
	private String detalle_falla;
	private boolean estado;
	private int cantHoras;
	
	
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.REFRESH)
	@JoinColumn(name="idEmpleado")
	private Empleado e;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.REFRESH)
	@JoinColumn(name="idPropietario")
	private Propietario prop;

	@OneToMany(targetEntity=OrdenRepuesto.class,mappedBy="orden",fetch=FetchType.EAGER)
	private List<OrdenRepuesto> listaRepuesto = new ArrayList<OrdenRepuesto>();
	
	
	
	public final List<OrdenRepuesto> getListaRepuesto() {
		return listaRepuesto;
	}


	public final void setListaRepuesto(List<OrdenRepuesto> listaRepuesto) {
		this.listaRepuesto = listaRepuesto;
	}


	public final void setId(Long id) {
		this.id = id;
	}


	public OrdenTrabajo(){}
	
	
	public long getId() {
		return id;
	}

	public Propietario getProp() {
		return prop;
	}


	public void setProp(Propietario prop) {
		this.prop = prop;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDetalle_falla() {
		return detalle_falla;
	}

	public void setDetalle_falla(String detalle_falla) {
		this.detalle_falla = detalle_falla;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}

	
	public Empleado getE() {
		return e;
	}

	public void setE(Empleado e) {
		this.e = e;
	}
	


}
