package com.cice.principal;

import java.util.ArrayList;

public class ArrayListMetodos {
/**
 * Esta clase contiene una descripcion de todos los metodos de la clase ArrayList<> lista = new ArrayList<>();
 * @param args
 */
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		// Guardar
		String a = "Juan";
		String b = "yo";
		lista.add(a);
		lista.add(b);
		
		lista.add("Pepe");
		lista.add("tomasa");
		lista.add("francos");
		lista.add("Wuasa");
		
		// borrar
		
		lista.remove("tomasa");
		
		//buscar
		
		lista.contains("tomasa");
		
		//Suelen ir dentro de un condicional.
		
		if(lista.contains("tomasa"))lista.remove("tomasa");
		
		//Por cada elemento de la lista lo imprime.
		//lista.forEach(i -> System.out.println("pepe"));
		
		//Para saber la posicion de un objeto en la lista
		lista.indexOf("pepe");
		//Recuperar
		lista.get(0);

		//remplazar		
		lista.add(3, b);
		lista.set(lista.indexOf("Wuasa"), a);
		
		// imprimir
		
		lista.forEach(i -> System.out.println(i));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
