package com.trabajoFinal.Controller;


import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.trabajoFinal.Model.OrdenRepuesto;
import com.trabajoFinal.Model.OrdenTrabajo;
import com.trabajoFinal.Model.Propietario;
import com.trabajoFinal.Service.IOrdenRepuestoService;
import com.trabajoFinal.Service.IOrdenTrabajoService;
import com.trabajoFinal.Service.IPropietarioService;
import com.trabajoFinal.Service.IRepuestoService;
import com.trabajoFinal.Service.PropietarioService;

@Controller
@RequestMapping("OrdenesTrabajos")
public class OrdenTrabajoController {



	@Autowired
	IOrdenTrabajoService  OrdenTrabajoService;
	@Autowired
	IPropietarioService  PropietarioService;
	@Autowired
	IOrdenRepuestoService  OrdenRepuestoService;
	@Autowired
	IRepuestoService RepuestoService;

	//LISTAR DE ORDENES DE TRABAJO
	@RequestMapping("/")
	public ModelAndView Lista(){
		List<OrdenTrabajo> listaOrdenesTrabajos = OrdenTrabajoService.listOrdenTrabajo();
		return new ModelAndView("OrdenesTrabajos/Lista","listaOrdenesTrabajos",listaOrdenesTrabajos);
	}

	//LISTAR DE ORDENES DE TRABAJO POR ESTADO
		@RequestMapping("/ListarEstado")
		public ModelAndView ListaEstado(){
			List<OrdenTrabajo> listaOrdenesTrabajos = OrdenTrabajoService.listOrdenTrabajoEstado();
			return new ModelAndView("OrdenesTrabajos/Lista","listaOrdenesTrabajos",listaOrdenesTrabajos);
		}
	
	
	

	//ALTA ORDEN TRABAJO
	@RequestMapping("Nuevo")
	public ModelAndView Nuevo(){
		//Nuevo MaV con View
		ModelAndView m = new ModelAndView("OrdenesTrabajos/Nuevo");


		//Agrego los modelos
		m.addObject("nuevaOrden", new OrdenTrabajo());
		Propietario p = null;
		try{

			//e = PropietarioService.getPropietario(Long.parseLong(id));

		}
		catch(org.hibernate.ObjectNotFoundException er){
			p = null;
		}


		return m;
	}

	//ALTA ORDEN TRABAJO
	@RequestMapping(path="Nuevo",method=RequestMethod.POST)
	public String AltaOrdenTrabajo(@ModelAttribute("nuevaOrden")OrdenTrabajo orden){

		Propietario pnuevo = PropietarioService.getPropietario(orden.getProp().getDni());
		List<OrdenTrabajo>	lista= pnuevo.getListaOrdenTrabajo();
		lista.add(orden);

		pnuevo.setListaOrdenTrabajo(lista);

		orden.setProp(PropietarioService.getPropietario(orden.getProp().getDni()));
		OrdenTrabajoService.addOrdenTrabajo(orden);
		PropietarioService.updatePropietario(pnuevo);


		return "redirect:/OrdenesTrabajos/";
	}





	//DETALLE ORDEN TRABAJO
	@RequestMapping("Detalles/{id}")
	public ModelAndView Detalles(@PathVariable("id")String id){
		OrdenTrabajo orden = null;
		try{
			orden = OrdenTrabajoService.getOrdenTrabajo(Long.parseLong(id));
		}
		catch(org.hibernate.ObjectNotFoundException er){
			orden = null;
		}
		return new ModelAndView("OrdenesTrabajos/Detalles","ordenTrabajo", orden);
	}
	
		
	
	
	// FINALIZAR ORDEN TRABAJO
	@RequestMapping("Finalizar/{id}")
	public String Finalizar(@PathVariable("id")String id){
		OrdenTrabajo orden = null;

		orden = OrdenTrabajoService.getOrdenTrabajo(Long.parseLong(id));
		if(orden.isEstado()){

			return "redirect:/OrdenesTrabajos/Detalles/{id}";
		}

		orden.setEstado(true);
		OrdenTrabajoService.updateOrdenTrabajo(orden);
		return "redirect:/OrdenesTrabajos/Detalles/{id}";
		
	}

	@RequestMapping("Modificar/{id}")
	public ModelAndView AgregarRepuesto(@PathVariable("id")String id){
		ModelAndView m = new ModelAndView("OrdenesTrabajos/Modificar");
	
		OrdenTrabajo orden =(OrdenTrabajoService.getOrdenTrabajo(Long.parseLong(id)));
		if(orden.isEstado() == false){
			
			OrdenRepuesto ordenNueva = new OrdenRepuesto();
			ordenNueva.setOrden(OrdenTrabajoService.getOrdenTrabajo(Long.parseLong(id)));
			m.addObject("ordenNueva",ordenNueva);
			m.addObject("listaRepuestos", RepuestoService.listRepuesto());
			
			return m;
		}
		List<OrdenTrabajo> listaOrdenesTrabajos = OrdenTrabajoService.listOrdenTrabajo();
		JOptionPane.showMessageDialog(null, "No se puede modificar una Orden de Trabajo finalizada");
		return new ModelAndView("/OrdenesTrabajos/Lista","listaOrdenesTrabajos",listaOrdenesTrabajos);
	}

	
	
	



	//MODIFICAR ORDEN REPUESTO  POST
	@RequestMapping(path="AgregarRepuesto",method=RequestMethod.POST)
	public String ModificarOrdenRepuesto(@ModelAttribute("ordenNueva")OrdenRepuesto orden){
		
			OrdenTrabajo ordenT = OrdenTrabajoService.getOrdenTrabajo(orden.getOrden().getId());
			ordenT.setCantHoras(orden.getOrden().getCantHoras());
			List<OrdenRepuesto> lista = ordenT.getListaRepuesto();
			lista.add(orden);
			ordenT.setListaRepuesto(lista);
			orden.setOrden(ordenT);
			OrdenTrabajoService.updateOrdenTrabajo(ordenT);
			OrdenRepuestoService.addOrdenRepuesto(orden);
		
		
		return "redirect:/OrdenesTrabajos/";
	}

	@RequestMapping("Det/{id}")
	public ModelAndView DetallesRepuestos(@PathVariable("id")String id){
		OrdenTrabajo orden = null;
		ModelAndView m = new ModelAndView("OrdenesTrabajos/DetallesRepuestos");
		
			orden = OrdenTrabajoService.getOrdenTrabajo(Long.parseLong(id));
			List<OrdenRepuesto> lista = orden.getListaRepuesto();
			m.addObject("listaRepuesto",lista);

			
		
		return m;
	}

	
	
	@RequestMapping("Total/{id}")
	public ModelAndView CalcularTotal(@PathVariable("id")String id){
		OrdenTrabajo orden = null;
		ModelAndView m = new ModelAndView("OrdenesTrabajos/Total");
			
			
			int preciorepuesto = 0;
			orden = OrdenTrabajoService.getOrdenTrabajo(Long.parseLong(id));
			List<OrdenRepuesto> lista = orden.getListaRepuesto();
			
			for (int i = 0; i < orden.getListaRepuesto().size(); i++) {
				OrdenRepuesto o = lista.get(i);
				preciorepuesto = preciorepuesto + (lista.get(i).getRepuesto().getPrecio()* o.getCantRepuestos());
				
			}	
			int precioconhoras=0;
			int canthoras=0;
			canthoras=orden.getCantHoras();
			
			precioconhoras = preciorepuesto +((orden.getCantHoras()*150));
			m.addObject("preciofinal",precioconhoras);
			m.addObject("canthoras",canthoras);
			m.addObject("orden",orden);
			m.addObject("preciorepuesto",preciorepuesto);
		
		
			
		 
		return m;
	}






}
