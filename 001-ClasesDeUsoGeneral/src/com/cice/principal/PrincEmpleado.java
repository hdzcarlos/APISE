package com.cice.principal;

import com.cice.clases.Empleado;
import com.cice.clases.Operaciones;

public class PrincEmpleado {
	public static void main(String[] args) {
	
		Empleado empleado = new Empleado();
		Operaciones operaciones = new Operaciones();
		
		
		empleado.entradaDeDatos();
		empleado.imprimir();
		empleado.pagarImpuestos();
		

	}

}
