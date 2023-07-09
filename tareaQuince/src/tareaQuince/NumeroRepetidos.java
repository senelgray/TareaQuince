package tareaQuince;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class NumeroRepetidos {

	public static void main (String[] args) {
		int[][] matriz = {{2,4,4},{5,7,2},{9,4,6},{33,11,33}};
		
		List<Integer> numeros = new ArrayList<>();
		
		for(int[] numero:matriz) {
			for(int numeroArray: numero) {
				numeros.add(numeroArray);
			}
		}
		Collections.sort(numeros);
		
		System.out.println("Los numeros ordenados de manera ascendente son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        Map<Integer, Integer> contadorNumeros = new HashMap<>();
        for (int numero : numeros) {
            contadorNumeros.put(numero, contadorNumeros.getOrDefault(numero, 0) + 1);
        }
        
        Set<Integer> numerosRepetidos = new HashSet<>();
        int maximaRepeticion = 0;
        System.out.println("Números repetidos:");
        for (Map.Entry<Integer, Integer> entry : contadorNumeros.entrySet()) {
            int numero = entry.getKey();
            int repeticiones = entry.getValue();
            if (repeticiones > 1) {
                System.out.println(numero);
                if (repeticiones > maximaRepeticion) {
                    maximaRepeticion = repeticiones;
                }
                numerosRepetidos.add(numero);
            }
        }
        System.out.println("Números que se repiten más:");
        for (Map.Entry<Integer, Integer> entry : contadorNumeros.entrySet()) {
            int numero = entry.getKey();
            int repeticiones = entry.getValue();
            if (repeticiones == maximaRepeticion) {
                System.out.println(numero);
            }
        }	
	
		
	}
}
