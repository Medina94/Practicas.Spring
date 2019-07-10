package prueba.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioImpl implements Servicio{
	@Autowired
	private Repositorio repositorio;
	
	@Override
	public String traerInverso(String txt) {
		return repositorio.invertirTexto(txt);
	}

	@Override
	public List<String> traerPermutacion(String txt) {
		return repositorio.permutar(txt);
	}
	
}
