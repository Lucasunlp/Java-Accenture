package com.trabajoFinal.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.trabajoFinal.Data.IOrdenRepuestoDAO;
import com.trabajoFinal.Model.OrdenRepuesto;

public class OrdenRepuestoService implements IOrdenRepuestoService{
	@Autowired
	IOrdenRepuestoDAO OrdenRepuestoDAO;
	
	public OrdenRepuesto getOrdenRepuesto(Long id) {
		return OrdenRepuestoDAO.getOrdenRepuesto(id);
	}

	public List<OrdenRepuesto> listOrdenRepuesto() {
		return OrdenRepuestoDAO.listOrdenRepuesto();
	}

	public void addOrdenRepuesto(OrdenRepuesto OrdenRepuesto) {
		OrdenRepuestoDAO.addOrdenRepuesto(OrdenRepuesto);	
	}

	public void updateOrdenRepuesto(OrdenRepuesto OrdenRepuesto) {
		OrdenRepuestoDAO.updateOrdenRepuesto(OrdenRepuesto);
	}

	public void removeOrdenRepuesto(Long id) {
		OrdenRepuestoDAO.removeOrdenRepuesto(id);
	}

	
}
