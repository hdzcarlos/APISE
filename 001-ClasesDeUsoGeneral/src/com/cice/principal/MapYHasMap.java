package com.cice.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapYHasMap {

	public static void main(String[] args) {
	
		Map<String,String> map = new HashMap<>();
		
		List<String> lista = new ArrayList<>();
		
		String a = "Juan";
		String b = "ObiJuan";
		String c = "LucasSky";
		
		
		//Guardar
		
		lista.add(a);
		lista.add(b);
		
		map.put("Primero", a);
		map.put("Segundo", b);
		
		//Recuperar
		
		lista.get(lista.indexOf("Juan"));
		map.get("Primero");
		
		//borrar
		lista.remove(lista.indexOf("Juan"));
		map.remove("Primero");
		
		// Imprimir toda la lista y todo el Map
		
		for (String string : lista) {
			
			System.out.println(string);
			
		}
		for (String key : map.keySet()) {
			
			System.out.println("K, v = " + key +" , " + map.get(key));
			
		}
		
		//Expresion Landa
		
		lista.forEach(elemento -> System.out.println(elemento));
		
		map.forEach((clave, valor) -> {System.out.println("K ,v = " + clave + " , "+ valor);});
		
		
		
		
		
		
		

	}

}
