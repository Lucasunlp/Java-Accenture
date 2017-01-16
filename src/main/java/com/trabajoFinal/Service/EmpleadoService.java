package com.trabajoFinal.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trabajoFinal.Data.IEmpleadoDAO;
import com.trabajoFinal.Model.Empleado;

public class EmpleadoService implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO EmpleadoDAO;
	
	public Empleado getEmpleado(long id) {
		return EmpleadoDAO.getEmpleado(id);
	}

	public List<Empleado> listEmpleado() {
		return EmpleadoDAO.listEmpleado();
	}

	public void addEmpleado(Empleado empleado) {
		EmpleadoDAO.addEmpleado(empleado);	
	}

	public void updateEmpleado(Empleado empleado) {
		EmpleadoDAO.updateEmpleado(empleado);
	}

	public void removeEmpleado(long id) {
		EmpleadoDAO.removeEmpleado(id);
	}

	
}
