package com.trabajoFinal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trabajoFinal.Data.IRepuestoDAO;
import com.trabajoFinal.Model.Repuesto;

public class RepuestoService implements IRepuestoService{
	@Autowired
	IRepuestoDAO RepuestoDAO;
	
	public Repuesto getRepuesto(long id) {
		return RepuestoDAO.getRepuesto(id);
	}

	public List<Repuesto> listRepuesto() {
		return RepuestoDAO.listRepuesto();
	}

	public void addRepuesto(Repuesto repuesto) {
		RepuestoDAO.addRepuesto(repuesto);	
	}

	public void updateRepuesto(Repuesto repuesto) {
		RepuestoDAO.updateRepuesto(repuesto);
	}

	public void removeRepuesto(long id) {
		RepuestoDAO.removeRepuesto(id);
	}

	


}
