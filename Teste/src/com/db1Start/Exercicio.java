/*
Exerc�cios:

Exerc�cio de Inteiro (Integer)
1 - some dois n�meros
2 - subtraia dois n�meros

Exerc�cios de Texto (String)
1 - Crie uma vari�vel que recebe um texto com letras minusculas e imprima com LETRAS MAIUSCULAS
2 - Crie uma vari�vel que receba um texto e devolva ele em LETRAS MINUSCULAS

Exerc�cio de Matematica (Double)
1 - Crie duas vari�veis double, defina um valor para cada, e exiba qual � o menor valor entre dois
2 - Crie tr�s vari�veis double, defina um valor p	ara cada,  e exiba qual � o menor valor entre os tr�s
*/


package com.db1Start;

public class Exercicio {
	
	
	Exercicio(){
		System.out.println("Db1 Start - Exercicios Java\n");
	}
	
	public void Inteiro(Integer valor1, Integer valor2) {
		System.out.println();
		
		System.out.println("soma = " + (valor1 + valor2));
		System.out.println("subtracao = " + (valor1 - valor2));
	}
	
	public void Texto(String texto) {
		System.out.println();
		
		System.out.println(texto.toUpperCase());
		System.out.println(texto.toLowerCase());
	}
	

	public void Real(double valor1, double valor2, double valor3) {
		System.out.println();
		
		
		System.out.println(valor1 < valor2? (valor1 + " menor que " + valor2 ) : (valor2 + " menor que " + valor3 ));
		
		
		if(valor1 > valor2 && valor1 > valor3)
			System.out.println(valor1 + " maior dos valores");
		else if(valor2 > valor1 && valor2 > valor3)
			System.out.println(valor2 + " maior dos valores");
		else if(valor3 > valor1 && valor3 > valor2)
			System.out.println(valor3 + " maior dos valores");
		else
			System.out.println("Existem valores iguais!");
	}	
}


