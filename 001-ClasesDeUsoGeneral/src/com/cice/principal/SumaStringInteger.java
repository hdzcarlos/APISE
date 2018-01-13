package com.cice.principal;

public class SumaStringInteger {

	public static void main(String[] args) {
		
		String s = "1,2,3,4,5,6,7,8,9,20";
		String[] array = s.split(",");
		int resultado = 0;
		for (String string : array) {
			int a = 0;
			a = Integer.parseInt(string);
			resultado += a;
			System.out.println(resultado);
			
		}
		System.out.println(resultado);

	}

}
