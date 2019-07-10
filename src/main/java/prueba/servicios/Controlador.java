package prueba.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invertir")
public class Controlador {
	@Autowired
	private Servicio servicio;
	
	@GetMapping
	public String mostrar(@RequestParam (value="texto") String txt) {
		return servicio.traerInverso(txt);
	}
	@GetMapping("/permutar")
	public List<String> mostrarLista(@RequestParam (value="lista") String txt){
		return servicio.traerPermutacion(txt);
	}
}
