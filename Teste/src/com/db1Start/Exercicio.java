/*
Exercícios de Inteiro (Integer)








Exercícios de Texto (String)




5 - Método que retorne o item 4 com a mesma quantidade de letras do item 3.



9 - Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA
10 - Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
11 - Método que receba um texto e exiba quantas vogais tem no texto

*/



package com.db1Start;

public class Exercicio {

	Exercicio(){
		System.out.println("Db1 Start - Exercicios Java\n");
	}
	
//exercicios inteiro	
	
	//1 - Método que some dois números
	public Integer soma(Integer valor1, Integer valor2) {		
		return valor1 + valor2;
	}
	
	//2 - Método que subtraia dois números
	public Integer subtrai(Integer valor1, Integer valor2) {		
		return valor1 - valor2;
	}
	
	//3 - Método que multiplique dois números
	public Integer multiplica(Integer valor1, Integer valor2) {		
		return valor1 * valor2;
	}
	
	//4 - Método que divida dois números
	public Integer divida(Integer valor1, Integer valor2) {		
		return valor1 / valor2;
	}
	
	//5 - Método que diga se o número é par
	public boolean isPar(Integer valor1) {		
		return (valor1%2 == 0);
	}	
	
	//6 - Método que receba dois números e diga qual é o maior
	public Integer maior(Integer valor1, Integer valor2) {		
		return valor1 > valor2? valor1 : valor2;
	}	
	
	//7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até 100.
	public Integer quantidadeImpares(Integer valor1) {
		if(valor1 % 2 == 0) 
			return valor1/2; 
		
		return (valor1/2)+1;
	}	
	
	
//exericios texto	
	
	//1 - Método que receba um texto e devolva ele em LETRAS MAIUSCULAS
	public String maiscula(String texto) {
		return texto.toUpperCase();
	}
	
	//2 - Método que receba um texto e devolva ele em LETRAS MINUSCULAS
	public String minuscula(String texto) {
		return texto.toLowerCase();
	}
	
	//3 - Método que receba DB1START e retorne a quantidade de letras que existe nesta palavra
	public Integer quantidadeLetra(String texto) {
		return texto.length();
	}	
	
	//4 - Método que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe
	public Integer quantidadeLetraEspaco(String texto) {
		texto = texto.trim();
		return texto.length();
	}	
	
	//6 - Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome 
	public String quatroPrimeirasLetras(String texto) {
		texto = texto.trim();
		return texto.substring(0, 4);
	}
	
	//7 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
	public String terceiraLetra(String texto) {
		texto = texto.trim();
		return texto.substring(2, texto.length());
	}	
	
	//8 - Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
	public String quatroUltimasLetras(String texto) {
		Integer tamanho = texto.length();
		
		texto = texto.trim();
		return texto.substring((tamanho-4), tamanho);
	}

	//12 - Método que receba um texto e devolva ele invertido
	public String inverteTexto(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}	
	
	
//exercicios Real	
	
	//1 - Método que exiba qual é o menor valor entre dois doubles
	public double menorReal(double valor1, double valor2) {
		if (valor1 < valor2)
			return valor1;

			return valor2;
	}	
	
	//3 - Método que exiba a média de três números
	public double mediaReal(double valor1, double valor2, double valor3) {
			return (valor1 + valor2 + valor3) / 3;
	}

	//4 - Método que calcule a área de um triangulo
	public double areaTriangulo(double altura, double base) {
		return (altura * base) / 2;
	}
}


