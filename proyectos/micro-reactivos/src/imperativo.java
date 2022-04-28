
import java.util.List;

public class imperativo {

	public static void main(String[] args) {
		
		
		List<Integer> listadoNum  = List.of(19, 3, 2, 12, 11, 10, 17, 12);
		
		
		IContador cont = (lista) ->
			lista.stream()
			.filter(n-> n > 10)
			.count();
		
		System.out.println("Numeros mayores de 10: " + cont.contadorElementos(listadoNum));
		
		
		
//		IContador cont = lista ->{
//			lista.forEach(n-> System.out.println("nuneros de la lista: "+n));
//		};
//		
//		cont.contadorElementos(listadoNum);
		

		
//		int cont = 0;
//		for(int numero : listadoNum) {
//			if(numero > 10) {
//				cont ++;
//			}
//		}
//		
//		System.out.println(cont);

	}

	

}
