package com.trabajoFinal.Data;

import java.util.List;

import com.trabajoFinal.Model.OrdenRepuesto;

public interface IOrdenRepuestoDAO {
	/*R*/
	public OrdenRepuesto getOrdenRepuesto(Long id);
	
	
	public List<OrdenRepuesto> listOrdenRepuesto();
	
	/* CUD */
	public void addOrdenRepuesto(OrdenRepuesto ordenRepuesto);
	
	public void updateOrdenRepuesto(OrdenRepuesto ordenRepuesto);
	
	public void removeOrdenRepuesto(Long id);

}
