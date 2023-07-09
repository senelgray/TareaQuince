package entregableQuince;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalabrasContar {
	
	public static void main (String [] args) {
		
		List<String> palabras = new ArrayList<>(Arrays.asList("legumbre", "amber","mineral","manual","remo","murcielago"));
		
		System.out.println("Las palabras que contienen mas de 4 caracteres son: ");
		int contadorForeach = 0;
		for(String palabra: palabras) {
			if(palabra.length()>4) {
				contadorForeach++;
				System.out.println(palabra);
			}
		}
		System.out.println("Y la cantidad es: "+contadorForeach);
		
		System.out.println("Usando Stream: ");
		long contadorStreams = palabras.stream()
				 .filter(palabra -> palabra.length() > 4)
				  .count();
	              
	
        System.out.println("Cantidad de palabras más largas : " + contadorStreams);

		
	}

}
