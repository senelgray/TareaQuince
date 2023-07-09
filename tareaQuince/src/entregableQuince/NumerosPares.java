package entregableQuince;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumerosPares {

	
	public static void main (String[] args) {
		
		List<Integer> numeros = new ArrayList<>(Arrays.asList(1,22,44,56,77,80,92,105,202));
		
		//con bucle FOREACH
		System.out.println("Numeros pares: ");
		for(int numeropar:numeros) {
			if(numeropar%2==0) {
				System.out.println(numeropar);
			}
		}
			
			
			//con stream
			
			System.out.println("Numeros pares: ");
			numeros.stream()
            .filter(numeropar -> numeropar % 2 == 0)
            .forEach(System.out::println);
			
		
		
	}
}
