package com.trabajoFinal.Service;

import java.util.List;

import com.trabajoFinal.Model.OrdenRepuesto;

public interface IOrdenRepuestoService {
	/*R*/
	public OrdenRepuesto getOrdenRepuesto(Long id);

	public List<OrdenRepuesto> listOrdenRepuesto();
	
	/* CUD */
	public void addOrdenRepuesto(OrdenRepuesto  OrdenRepuesto);
	
	public void updateOrdenRepuesto(OrdenRepuesto OrdenRepuesto);
	
	public void removeOrdenRepuesto(Long id);
}
