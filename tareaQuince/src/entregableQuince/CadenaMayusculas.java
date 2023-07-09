package entregableQuince;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CadenaMayusculas {
	
	public static void main (String[] args) {
		List<String> cadenas = new ArrayList<>(Arrays.asList("perro", "mundo", "manantial", "java", "limpiar"));
		
		
		System.out.println("Las palabras convertidas en mayusculas con foreach, son: ");
		
		for(String cadena: cadenas) {
			String Mayusculas=cadena.toUpperCase();
			System.out.print(" "+Mayusculas);
			
		}
		
		System.out.println("Las palabras convertidas en mayusculas con stream, son: ");

		cadenas.stream()
		.map(String::toUpperCase)
        .forEach(System.out::println);
		
	}

}
