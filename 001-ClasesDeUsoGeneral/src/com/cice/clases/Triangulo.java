package com.cice.clases;

import java.util.Scanner;

public class Triangulo {
	/*
	 * Desarrollar un programa que cargue los lados de un triángulo e implemente los siguientes métodos: inicializar los atributos,
	 *  imprimir el valor del lado mayor y otro método que muestre si es equilátero o no
	 */
	Scanner sc = new Scanner(System.in);
	
	private int lado1;
	private int lado2;
	private int lado3;
	
	public void datosDeEntrada() {
		
		System.out.println("Introduzca los lados del triangulo:");
		System.out.print("Lado 1 : ");
		lado1 = sc.nextInt();
		System.out.print("Lado 2 : ");
		lado2 = sc.nextInt();
		System.out.print("Lado 3 : ");
		lado3 = sc.nextInt();
	}
	public void imprimirLadoMayor() {
		if(lado1 > lado2 && lado1 > lado3) {
			System.out.println(lado1 + " es el mayor de los 3 lados");
		}else if (lado2> lado1 && lado2 > lado3){
			System.out.println(lado2 + " Es el mayor de los 3 lados");
		}else if (lado3> lado1 && lado3 > lado2) {
			System.out.println(lado3 +" Es el mayor de los 3 lados ");
		}else {
			System.out.println("Todos los lados son iguales. Por lo tanto ");
		}
		
	}
	public void esEquilatero() {
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("Es equilatero");
			
		}else if(lado2 == lado3) {
			System.out.println("Es equilatero");
		}else {
			System.out.println("No es equilatero.");
		}
	}
	

}
