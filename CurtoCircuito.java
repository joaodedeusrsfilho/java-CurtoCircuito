package com.junior.curso_java_basico.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean resultado1 = false &
				verdadeiro;
		
		boolean resultado2 = false &&
				verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		int resultado3 = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado3);
	}

}
