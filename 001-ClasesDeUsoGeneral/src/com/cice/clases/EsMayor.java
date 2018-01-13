package com.cice.clases;

import java.util.Scanner;

public class EsMayor {
	//Confeccionar una clase que permita ingresar tres valores por teclado. Luego mostrar el mayor y el menor
	public void inicializar() {
		int valor1;
		int valor2;
		int valor3;
		int salir = 0;
		int mayor;
		int menor;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.print("Ingrrese valor 1: ");
		valor1 = sc.nextInt();
		System.out.print("Ingrrese valor 2: ");
		valor2 = sc.nextInt();
		System.out.print("Ingrrese valor 3: ");
		valor3 = sc.nextInt();
		System.out.println("Puse 0 para salir");
		
		mayor = calcularMayor(valor1, valor2, valor3);
		menor = calcularMenor(valor1, valor2, valor3);
		System.out.println("El valor mayor de los 3 es: "+mayor);
		System.out.println("El valor menor de los 3 es: "+menor);
		}while (salir == 0);
		
	}
	
	public int calcularMayor(int v1, int v2, int v3) {
		int m;
		if (v1 > v2 && v1 > v3) {
			m=v1;
		}else if (v2 > v3) m=v2;
		else {
			m=v3;
		}
		return m;
	}
	public int calcularMenor(int v1, int v2, int v3) {
		int m1;
		if (v1 < v2 && v1 < v3) m1=v1;
		else if (v2 < v3) m1=v2;
		else {
			m1=v3;
		}
		
		
		return m1;
	}
}

	