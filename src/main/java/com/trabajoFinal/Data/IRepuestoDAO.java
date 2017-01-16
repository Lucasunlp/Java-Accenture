package com.trabajoFinal.Data;

import java.util.List;


import com.trabajoFinal.Model.Repuesto;

public interface IRepuestoDAO {


	public Repuesto getRepuesto(long id);
	
	
	public List<Repuesto> listRepuesto();

	

	public void addRepuesto(Repuesto repuesto);

	public void updateRepuesto(Repuesto repuesto);

	public void removeRepuesto(long id);

}
