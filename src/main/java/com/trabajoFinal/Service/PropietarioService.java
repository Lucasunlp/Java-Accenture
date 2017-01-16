package com.trabajoFinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trabajoFinal.Data.IPropietarioDAO;
import com.trabajoFinal.Model.Propietario;

public class PropietarioService implements IPropietarioService {

	@Autowired
	IPropietarioDAO  PropietarioDAO;
	
	public Propietario getPropietario(long id) {
		return PropietarioDAO.getPropietario(id);
	}

	public List<Propietario> listPropietario() {
		return PropietarioDAO.listPropietario();
	}

	public void addPropietario(Propietario propietario) {
		PropietarioDAO.addPropietario(propietario);	
	}

	public void updatePropietario(Propietario propietario) {
		PropietarioDAO.updatePropietario(propietario);
	}

	public void removePropietario(long id) {
		PropietarioDAO.removePropietario(id);
	}
	
}
