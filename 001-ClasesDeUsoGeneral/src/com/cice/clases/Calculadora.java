package com.cice.clases;

import java.util.Scanner;

public class Calculadora {
	
	Scanner sc = new Scanner(System.in);
	int numA = 0;
	int numB = 0;

	public void mostrarMenu() {
		int opcion = 0;
		do {
		System.out.println("CALCULADORA 1.1");
		System.out.println("===============");
		System.out.println("OPCIONES");
		System.out.println("1.- Sumar ");
		System.out.println("2.- Restar ");
		System.out.println("3.- Multiplicar ");
		System.out.println("4.- Dividir");
		System.out.println("0.- Salir ");	
		System.out.print("Elija una opcion: ");
		opcion = sc.nextInt();
		
			switch(opcion) {
				case 1:
					sumar();
					break;
				case 2:
					restar();
					break;
				case 3:
					multiplicar();
					break;
				case 4:
					dividir();
					break;
				case 0:
					abandonar();
					break;
				default:
					System.out.println("La opcion no es correcta , vuelva a intentarlo.");
						
			}
		}while(opcion !=0);
		
	}
	private void recogidaDatos() {
		System.out.println("Introduzca dos numeros.");
		System.out.print("Numero A");
		numA = sc.nextInt();
		System.out.print("Numero b");
		numB = sc.nextInt();
	}
	private void sumar() {
		recogidaDatos();
		System.out.println("La suma del numero A y el número B es = "+(numA + numB));
	}
	private void restar() {
		recogidaDatos();
		System.out.println("La resta del numero A y el número B es = "+(numA - numB));
		
		
	}
	private void multiplicar() {
		recogidaDatos();
		System.out.println("La multiplicación del numero A y el número B es = "+(numA * numB));
		
	}
	private void dividir() {
		recogidaDatos();
		System.out.println("La division del numero A y el número B es = "+(numA / numB));
	}
	private void abandonar() {
		System.out.println("Ha elegido usted abandonar la aplicación , hasta pronto.");
	}
	
	
	
	

}
