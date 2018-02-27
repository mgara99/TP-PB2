package ar.edu.unlam.pb2.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		//Creamos una lista instanciando un ArrayList
		List<Rectangulo> lista = new ArrayList<Rectangulo>();

		
		//Instanciamos tres objetos
		Rectangulo rec1 = new Rectangulo(5.0, 6.0);
		Rectangulo rec2 = new Rectangulo(7.0, 8.0);
		Rectangulo rec3 = new Rectangulo(2.0, 5.0);

		
		//Los agregamos a la lista
		lista.add(rec1);
		lista.add(rec2);
		lista.add(rec3);

		
		//Recorremos la lista for each
		for (Rectangulo rec : lista) {
			System.out.println(rec.getLado2());
		}

		
		//Recorrecmos la lista Iterator
		Iterator<Rectangulo> iterador = lista.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next().getLado1());
		}
		
		
		//
		List<Integer> lista2 = new ArrayList<Integer>();

		lista2.add(1);
		lista2.add(2);
		lista2.add(3);
		
		//Elimino un elemento especificando su pocision en la lista
		lista2.remove(0);
		
		//Muestro un elemento especificando su pocision en la lista
		System.out.println(lista2.get(1));
		//(Al remover el "1" de la lista, el "3" queda en la posicion 1)

	}

}
