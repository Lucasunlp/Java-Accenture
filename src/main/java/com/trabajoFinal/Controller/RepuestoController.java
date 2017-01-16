package com.trabajoFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.trabajoFinal.Model.Repuesto;
import com.trabajoFinal.Service.IRepuestoService;



@Controller
@RequestMapping("Repuestos")
public class RepuestoController {


	@Autowired
	IRepuestoService RepuestoService;
	
	//LISTAR REPUESTOS
			@RequestMapping("/")
			public ModelAndView Lista(){
				List<Repuesto> listaRepuestos = RepuestoService.listRepuesto();
				return new ModelAndView("Repuestos/Lista","listaRepuestos", listaRepuestos);
			}


}
