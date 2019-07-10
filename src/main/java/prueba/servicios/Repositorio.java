package prueba.servicios;

import java.util.List;

public interface Repositorio {
	public String invertirTexto(String txt);
	
	public List<String> permutar(String txt);
}
