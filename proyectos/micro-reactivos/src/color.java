import java.util.List;
import java.util.stream.Collectors;

public class color {

	public static void main(String[] args) {
		
		List<String> colores = List.of("azul", "verde", "amarillo", "rosa");
		
		Object DeleteColor = colores.stream()
				.filter(s -> !s.equals("rosa"))
				.peek(t -> System.out.println("Es " + t))
				.map(j -> j.toString().toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("Delete: "+ DeleteColor);

	}

}
