package com.trabajoFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trabajoFinal.Model.OrdenTrabajo;
import com.trabajoFinal.Model.Propietario;
import com.trabajoFinal.Service.IEmpleadoService;
import com.trabajoFinal.Service.IPropietarioService;

@Controller
@RequestMapping("Propietarios")
public class PropietarioController {

	@Autowired
	IPropietarioService PropietarioService;

	@Autowired
	IEmpleadoService empleadoService;
	
	
	//LISTAR PROPIETARIOS
	@RequestMapping("/")
	public ModelAndView Lista(){
		List<Propietario> listaProp = PropietarioService.listPropietario();
		return new ModelAndView("Propietarios/Lista","listaPropietarios", listaProp);
	}


	//ALTA PROPIETARIO
	@RequestMapping("Nuevo")
	public ModelAndView Nuevo(){
		//Nuevo MaV con View
		ModelAndView m = new ModelAndView("Propietarios/Nuevo");
		//Agrego los modelos
		m.addObject("propietario", new Propietario());

		return m;
	}

	//ALTA PROPIETARIO
	@RequestMapping(path="Nuevo",method=RequestMethod.POST)
	public String AltaPropietario(@ModelAttribute("prop")Propietario p){
		PropietarioService.addPropietario(p);
		return "redirect:/OrdenesTrabajos/Nuevo";
	}




	@RequestMapping("VerificarDni")
	public ModelAndView Verificar(){
		//Nuevo MaV con View
		ModelAndView m = new ModelAndView("Propietarios/VerificarDni");


		//Agrego los modelos
		m.addObject("propietario", new Propietario());



		return m;
	}

	@RequestMapping(path="VerificarDni", method=RequestMethod.POST)
	public ModelAndView verificarDni(@ModelAttribute("propietario")Propietario prop){
		ModelAndView m = new ModelAndView("OrdenesTrabajos/Nuevo");
		OrdenTrabajo orden = null;

		try {
			if(PropietarioService.getPropietario(prop.getDni()) != null)
				orden =new OrdenTrabajo();
				orden.setProp(PropietarioService.getPropietario(prop.getDni()));
				m.addObject("nuevaOrden",orden);
				m.addObject("listaEmpleados",empleadoService.listEmpleado());

			return m;

		}
		catch (Exception e) {
				
		}
		
		return new ModelAndView("Propietarios/Nuevo", "propietario", new Propietario());	

	}



}



