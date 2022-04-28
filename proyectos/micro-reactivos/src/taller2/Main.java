package taller2;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Producto> shopping = List.of(
				new Producto("Clothes", new BigDecimal("15.90"), Impuesto.NORMAL),
				new Producto("Bread", new BigDecimal("1.5"), Impuesto.SUPERREDUCED),
				new Producto("Meat", new BigDecimal("13.99"), Impuesto.REDUCED),
				new Producto("Cheese", new BigDecimal("3.59"), Impuesto.SUPERREDUCED),
				new Producto("Coke", new BigDecimal("1.89"), Impuesto.REDUCED),
				new Producto("Whiskey", new BigDecimal("19.90"), Impuesto.NORMAL));
		
		
		Object m = shopping.stream()
				.filter(s -> s.name.startsWith("C"))
				.map(x -> x.name)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Productos que empiezán por c: "+ m);
		
		
		Object p = shopping.stream()
				.map(n -> n.price.add(n.price.multiply(BigDecimal.valueOf(n.impuesto.getPercent()*0.01))))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println("Resultado: " + p);

	}

	
	
}
