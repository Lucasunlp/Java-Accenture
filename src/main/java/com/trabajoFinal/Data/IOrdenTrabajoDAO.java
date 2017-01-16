package com.trabajoFinal.Data;

import java.util.List;


import com.trabajoFinal.Model.OrdenTrabajo;

public interface IOrdenTrabajoDAO {




	/*R*/
	public OrdenTrabajo getOrdenTrabajo(Long id);
	
	
	public List<OrdenTrabajo> listOrdenTrabajo();
	
	/* CUD */
	public void addOrdenTrabajo(OrdenTrabajo ordenTrabajo);
	
	public void updateOrdenTrabajo(OrdenTrabajo ordenTrabajo);
	
	public void removeOrdenTrabajo(long id);


	public List<OrdenTrabajo> listOrdenTrabajoEstado();

}
