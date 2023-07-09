package tareaQuince;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NombresStream {
	
	public static void main (String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Pedro");
		nombres.add("Luisa");
		nombres.add("Ruben");
		nombres.add("Miguel");
		nombres.add("Georgina");
		nombres.add("Azucena");
		
        String nombresFiltradosMayusculas = nombres.stream()
        		.filter(nombre -> nombre.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Nombres filtrados y en mayusculas: " + nombresFiltradosMayusculas);
    }
}