package com.trabajoFinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.trabajoFinal.Data.IOrdenTrabajoDAO;

import com.trabajoFinal.Model.OrdenTrabajo;

public class OrdenTrabajoService implements IOrdenTrabajoService {

	@Autowired
	IOrdenTrabajoDAO OrdenTrabajoDAO;
	
	public OrdenTrabajo getOrdenTrabajo(long id) {
		return OrdenTrabajoDAO.getOrdenTrabajo(id);
	}

	public List<OrdenTrabajo> listOrdenTrabajo() {
		return OrdenTrabajoDAO.listOrdenTrabajo();
	}

	public void addOrdenTrabajo(OrdenTrabajo OrdenTrabajo) {
		OrdenTrabajoDAO.addOrdenTrabajo(OrdenTrabajo);	
	}

	public void updateOrdenTrabajo(OrdenTrabajo OrdenTrabajo) {
		OrdenTrabajoDAO.updateOrdenTrabajo(OrdenTrabajo);
	}

	public void removeOrdenTrabajo(long id) {
		OrdenTrabajoDAO.removeOrdenTrabajo(id);
	}

	public List<OrdenTrabajo> listOrdenTrabajoEstado() {
		return OrdenTrabajoDAO.listOrdenTrabajoEstado();
		
	}

	
	
}
