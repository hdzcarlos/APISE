package com.cice.negocio;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
	
	
	ArrayList<Double> listaPrecios = new ArrayList<Double>();
	
	
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("Binenvenido al programa de tu negocio");
			System.out.println("Esto es lo que puedo hacer por ti");
			System.out.println("1.- Nuevo precio");
			System.out.println("2.- Precio medio");
			System.out.println("3.- Precio maximo");
			System.out.println("4.- Precio minimo");
			System.out.println("5.- Mostar precios");
			System.out.println("0.- Salir");
			System.out.print("Elija una opcion");
			opcion = sc.nextInt();
			controles(opcion);
			
			
		}while(opcion != 0);
		
	}
	private void controles(int opcion){
		switch (opcion) {
		case 0:
			System.out.println("Ha elegido usted salir de la aplicacion.");
			break;
			
		case 1:
			nuevoPrecio();
			
			break;
		case 2:
			precioMedio();
			
			
			break;
		case 3:
			precioMaximo();
			
			break;
		case 4:
			precioMinimo();
			
			break;
		case 5:
			mostrarPrecios();
			
			break;
			

		default:
			System.out.println("Ninguna opcion elegida es correcta.");
			break;
		}
	}
	
	private void nuevoPrecio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un nuevo precio");
		listaPrecios.add(sc.nextDouble());
		
	}
	private void precioMedio() {
		double media = 0;
		for (Double long1 : listaPrecios) {
			media += long1;
		}
		System.out.println("El precio medio es: "+ media / listaPrecios.size());
		
	}

	private void precioMaximo() {
		double precioMax = 0;
		for(Double precio : listaPrecios) {
			precioMax = Math.max(precioMax, precio );
		}
		System.out.println("El precio maximo es: " + precioMax);
		
	
	}
	private void precioMinimo() {
		double precioMin = listaPrecios.get(0);
		for(Double precio : listaPrecios) {
		precioMin = Math.min(precioMin, precio);
			
		}
		System.out.println("El precio Minimo es : " + precioMin);
		
	}
	private void mostrarPrecios() {
		for (Double precio : listaPrecios) {
			System.out.println("Precio: "+ precio);
		}
		
	}

}
