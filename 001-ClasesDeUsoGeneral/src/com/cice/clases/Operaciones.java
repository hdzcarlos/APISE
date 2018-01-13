package com.cice.clases;

import java.util.Scanner;

public class Operaciones {
	Scanner sc = new Scanner(System.in);
	
	private int  num1 = 0;
	private int  num2 = 0;
	
	public void inicializacion() {
		
		System.out.println("Introduzca los datos de entrada.");
		System.out.print(" Numero 1: ");
		num1 = sc.nextInt();
		System.out.print(" Numero 2: ");
		num2 = sc.nextInt();	
	}
	public void suma() {
		System.out.println("La suma de los dos numeros es: "+ (num1 + num2 ));
	}
	public void resta() {
		System.out.println("La resta de los dos numeros es: "+ (num1 - num2));
	}
	public void division() {
		System.out.println("La division de los dos numeros es: "+ (num1 / num2));
	}
	public void multiplicacion() {
		System.out.println("La multiplicacion de los dos numeros es: "+ (num1 * num2));
	}

}
