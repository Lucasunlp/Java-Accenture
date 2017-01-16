package com.trabajoFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trabajoFinal.Model.Empleado;
import com.trabajoFinal.Service.IEmpleadoService;


@Controller
@RequestMapping("Empleados")
public class EmpleadoController {

		@Autowired
		IEmpleadoService EmpleadoService;

		//LISTAR EMPLEADOS
		@RequestMapping("/")
		public ModelAndView Lista(){
			List<Empleado> listaEmp = EmpleadoService.listEmpleado();
			return new ModelAndView("Empleados/Lista","listaEmpleados", listaEmp);
		}

		
		
//		//ALTA EMPLEADO
//		@RequestMapping("Nuevo")
//		public ModelAndView Nuevo(){
//			//Nuevo MaV con View
//			ModelAndView m = new ModelAndView("Empleados/Nuevo");
//			//Agrego los modelos
//			m.addObject("empleado", new Empleado());
//			m.addObject("listaDptos", departamentoDAO.ListarDepartamentos());
//			return m;
//		}
		
		
		

	}



