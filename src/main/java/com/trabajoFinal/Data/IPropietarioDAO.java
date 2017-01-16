package com.trabajoFinal.Data;

import java.util.List;


import com.trabajoFinal.Model.Propietario;

public interface IPropietarioDAO {
	/*R*/
	public Propietario getPropietario(Long id);
	
	
	public List<Propietario> listPropietario();
	
	/* CUD */
	public void addPropietario(Propietario propietario);
	
	public void updatePropietario(Propietario propietario);
	
	public void removePropietario(long id);
}
