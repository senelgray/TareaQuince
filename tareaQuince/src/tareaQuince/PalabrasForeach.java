package tareaQuince;
import java.util.*;
import java.util.List;


public class PalabrasForeach {
	
public static void main(String[] args) {
	
	List<String> palabras = new ArrayList<>();
	
	palabras.add("nuevo");
	palabras.add("huevo");
	palabras.add("suave");
	palabras.add("mero");
	palabras.add("cuervo");
	palabras.add("nuevo");
	palabras.add("cuervo");
	palabras.add("nuevo");
	palabras.add("huevo");
	
	Map<String, Integer> contadorPalabras = new HashMap<>();
	
	for(String palabra: palabras) {
		if(contadorPalabras.containsKey(palabra)) {
			 contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
        } else {
            contadorPalabras.put(palabra, 1);
		}
		
	}
	System.out.println("Palabras repetidas:");
    for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey());
        }
    }
}
}
