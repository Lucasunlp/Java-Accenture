package com.trabajoFinal.Service;

import java.util.List;

import com.trabajoFinal.Model.Propietario;


public interface IPropietarioService {

	
	public Propietario getPropietario(long id);

	public List<Propietario> listPropietario();
	
	/* CUD */
	public void addPropietario(Propietario propietario);
	
	public void updatePropietario(Propietario propietario);
	
	public void removePropietario(long id);
}
