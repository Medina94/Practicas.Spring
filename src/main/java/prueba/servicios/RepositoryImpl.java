package prueba.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryImpl implements Repositorio {

	@Override
	public String invertirTexto(String txt) {
		String invertir = "";

		for (int i = txt.length() - 1; i >= 0; i--) {
			invertir += txt.charAt(i);
		}

		return invertir;
	}
	// -----------------------------------------------------------------------
	// FUNCION PARA PERMUTAR UN STRING-> DEVUELVE UNA LISTA CON TODAS LAS COMBINACIONES POSIBLES DE STRINGS
	@Override
	public List<String> permutar(String txt) {
		List<String> lista = new ArrayList();
		//String s = "";
		char[] array = txt.toCharArray();
		char[] copia = array;
		char aux;
		lista.add(txt);
		for (int i = 0; i < txt.length(); i++) {
			for (int j = 0; j < txt.length(); j++) {
				for (int k = 0; k < txt.length(); k++) {
					for (int l = 0; l < txt.length(); l++) {
						aux = copia[k];
						copia[k] = copia[l];
						copia[l] = aux;
						if (!lista.contains(String.valueOf(copia))) {
							lista.add(String.valueOf(copia));
						}
					}
					aux = copia[j];
					copia[j] = copia[k];
					copia[k] = aux;
				}
				aux = copia[i];
				copia[i] = copia[j];
				copia[j] = aux;
				
			}
		}

		return lista;
	}

}
