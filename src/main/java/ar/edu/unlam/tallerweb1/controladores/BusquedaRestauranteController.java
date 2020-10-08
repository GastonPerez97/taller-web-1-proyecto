package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.RestauranteModel;
import ar.edu.unlam.tallerweb1.servicios.RestauranteService;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

@Controller
public class BusquedaRestauranteController {

	@Autowired
	private RestauranteService restauranteService;

	@RequestMapping("/buscarRestaurantes")
	public ModelAndView contact() {
		ModelMap modelo = new ModelMap();
		modelo.put("restaurante", new RestauranteModel());
		return new ModelAndView("buscadorRestaurantes", modelo);
	}

	/*
	 * @RequestMapping("/listarRestaurante") public ModelAndView irAlBuscador() {
	 * ModelMap model = new ModelMap(); RestauranteModel restaurante = new
	 * RestauranteModel(); restaurante.setNombre("Sucursal1");
	 * model.put("restaurante", model); return new
	 * ModelAndView("listadoRestaurantes");
	 * 
	 * }
	 */

	@RequestMapping(path = "/buscarRestaurante", method = RequestMethod.POST)
	public ModelAndView restaurantesa(@ModelAttribute("restaurante") RestauranteModel datoBusqueda) {
		ModelMap modelo = new ModelMap();
		modelo.put("restaurante", datoBusqueda);
		List<RestauranteModel> lista = restauranteService.buscarRestaurantePorNombre(datoBusqueda.getNombre());
		modelo.put("restaurantes", lista);
		return new ModelAndView("listadoRestaurantes", modelo);
	}

}
