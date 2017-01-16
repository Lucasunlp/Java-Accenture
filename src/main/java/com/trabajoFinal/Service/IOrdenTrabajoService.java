package com.trabajoFinal.Service;

import java.util.List;

import com.trabajoFinal.Model.OrdenTrabajo;

public interface IOrdenTrabajoService {

	
	
	/*R*/
	public OrdenTrabajo getOrdenTrabajo(long id);

	public List<OrdenTrabajo> listOrdenTrabajo();
	
	/* CUD */
	public void addOrdenTrabajo(OrdenTrabajo  OrdenTrabajo);
	
	public void updateOrdenTrabajo(OrdenTrabajo OrdenTrabajo);
	
	public void removeOrdenTrabajo(long id);

	public List<OrdenTrabajo> listOrdenTrabajoEstado();
}
