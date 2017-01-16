package com.trabajoFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trabajoFinal.Model.OrdenRepuesto;
import com.trabajoFinal.Model.OrdenTrabajo;
import com.trabajoFinal.Service.IOrdenRepuestoService;
import com.trabajoFinal.Service.OrdenTrabajoService;



@Controller
@RequestMapping("OrdenesRepuestos")
public class OrdenRepuestoController {

	@Autowired
	IOrdenRepuestoService  OrdenRepuestoService;

	//LISTAR DE ORDENES REPUESTO
	@RequestMapping("/")
	public ModelAndView Lista(){
		List<OrdenRepuesto> listaOrdenRepuesto = OrdenRepuestoService.listOrdenRepuesto();
		return new ModelAndView("OrdenesRepuestos/Lista","listaOrdenRepuesto",listaOrdenRepuesto);
	}



	
		
	
	
	




}
