package com.trabajoFinal.Service;

import java.util.List;


import com.trabajoFinal.Model.Repuesto;

public interface IRepuestoService {

	/*R*/
	public Repuesto getRepuesto(long id);

	public List<Repuesto> listRepuesto();
	
	/* CUD */
	public void addRepuesto(Repuesto repuestoo);
	
	public void updateRepuesto(Repuesto repuesto);
	
	public void removeRepuesto(long id);

}
