package com.cice.clases;

import java.util.Scanner;

public class Persona {
	Scanner sc = new Scanner(System.in);
	
	// Creamos una parsona que tengq una carga de datos
	
	 int edad;
	 String nombre;
	 String profesion;
	
	
	public void datosPersonales() {
		System.out.print("Introduzca su nombre: ");
		nombre = sc.next();
		System.out.print("Introduzca su edad: ");
		edad = sc.nextInt();
				
 	}
	public void imprimir() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
	}
	
	public void esMayorDeEdad() {
		if(edad>= 18) System.out.println(nombre+ "Es mayor de edad");
	}

}
