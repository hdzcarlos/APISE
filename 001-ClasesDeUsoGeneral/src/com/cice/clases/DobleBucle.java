package com.cice.clases;

public class DobleBucle {

	public static void main(String[] args) {
	
		String[][] atributos = new String[2][6];
		
		atributos[0][0] = "Nombre";
		atributos[0][1] = "Apellido";
		atributos[0][2] = "Magia";
		atributos[0][3] = "Presentacion";
		atributos[0][4] = "inciativa";
		atributos[0][5] = "Actitudes";
		
		atributos[1][0] = "Kaske";
		atributos[1][1] = "Perez";
		atributos[1][2] = "Oscura";
		atributos[1][3] = "Hola soy kaske";
		atributos[1][4] = "Tengo gran inciativa";
		atributos[1][5] = "Soy buen lanzador";
				
		
		for (String[] atributo : atributos) {
		System.out.println("================");
		System.out.println("Persona ");
		System.out.println("================");
		for(String dato: atributo) {
			
			System.out.println(dato);
		}
		
		}
		
	/*	for(int i = 0; i < atributos.length; i++) {
			
			System.out.println("Personaje 1 ");
			System.out.println("============");
			
			
		for(int j = 0; j < atributos[i].length; j++) {
			System.out.println(atributos[i][j]);
		}
		
		}
*/
	}

}
