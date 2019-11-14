package com.db1Start;

public class Main {

	public static void main(String[] args) {	
		String texto = "Curso Db1 StaRt";
		Integer valor1 = 10, valor2 = 27;
		double real1 = 10.3, real2 = 5.8, real3 = 20.5;
		
		Exercicio exercicio = new Exercicio();
		
		//exercicios Integer
		System.out.println("-----Exercicios Integer");
		
		System.out.println(exercicio.soma(valor1, valor2));
		System.out.println(exercicio.subtrai(valor1, valor2));
		System.out.println(exercicio.multiplica(valor1, valor2));
		System.out.println(exercicio.divida(valor1, valor2));
		System.out.println(exercicio.isPar(valor1));
		System.out.println(exercicio.maior(valor1, valor2));
		System.out.println(exercicio.quantidadeImpares(valor1));
		
		//exercicios String
		System.out.println("\n-----Exercicios String");
		
		System.out.println(exercicio.maiscula(texto));
		System.out.println(exercicio.minuscula(texto));
		System.out.println(exercicio.quantidadeLetra(texto));
		System.out.println(exercicio.quantidadeLetraEspaco(texto));
		System.out.println(exercicio.quatroPrimeirasLetras(texto));
		System.out.println(exercicio.terceiraLetra(texto));
		System.out.println(exercicio.quatroUltimasLetras(texto));
		System.out.println(exercicio.substituiTexto(texto));
		System.out.println(exercicio.inverteTexto(texto));
		//exercicio.formataTexto();
		System.out.println(exercicio.quantidadeVogal(texto));
		
		//exercicios double
		System.out.println("\n-----Exercicios double");
		System.out.println(exercicio.menorReal(real1, real2));
		System.out.println(exercicio.mediaReal(real1, real2, real3));
		System.out.println(exercicio.areaTriangulo(real1, real2));
	}
}

