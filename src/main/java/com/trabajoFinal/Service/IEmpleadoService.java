package com.trabajoFinal.Service;

import java.util.List;

import com.trabajoFinal.Model.Empleado;



public interface IEmpleadoService {
	/*R*/
	public Empleado getEmpleado(long id);

	public List<Empleado> listEmpleado();
	
	/* CUD */
	public void addEmpleado(Empleado empleado);
	
	public void updateEmpleado(Empleado empleado);
	
	public void removeEmpleado(long id);
}
