package com.cice.clases;

import java.util.Scanner;

public class Empleado {
	/*
	 * Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo.
	 * Confeccionar los m�todos para la carga, otro para imprimir sus datos
	 * y por �ltimo uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000
	 * 
	 * Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular su suma, 
	 * resta, multiplicaci�n y divisi�n, cada una en un m�todo, imprimir dichos resultados
	 */
	 Scanner sc = new Scanner(System.in);
	 
	 private String nombre;
	 private double sueldo;
	 
	 
	 public void entradaDeDatos() {
		 System.out.println("Introduzca su nomnbre");
		 nombre = sc.next();
		 System.out.println("Introduzca su sueldo");
		 sueldo = sc.nextDouble();
		 
	 }
	 public void imprimir() {
		 System.out.println("su nombre es : "+ nombre);
		 System.out.println("Su sueldo es : "+ sueldo);
		 
		 }
	  public void pagarImpuestos() {
		  if (sueldo >= 3000) System.out.println("El empeleado "+ nombre +" debe pagar impuestos porque su sueldo es "+ sueldo);
	  }
	
	
	
	
	
	
	
	
	
	
	
	
}
