package com.cice.clases;

import java.util.Scanner;

public class TablaMultiplicar {

	

	 public void cargarValor() {
	        Scanner teclado=new Scanner(System.in);
	        int valor;
	        do {
	        	System.out.println("");
	            System.out.println("Ingrese valor:");
	            valor=teclado.nextInt();
	            if (valor!=-1) {
	                calcular(valor);
	            }
	        } while (valor!=-1);
	    }
	    
	    public void calcular(int v) {
	        for(int f=v;f<=v*10;f=f+v) {
	            System.out.print(f+"-");
	        }
	    }    
}
	    
	    
	    