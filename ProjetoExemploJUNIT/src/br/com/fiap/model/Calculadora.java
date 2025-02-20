package br.com.fiap.model;

public class Calculadora {

	public int soma (int num1, int num2) {
		int resultadoSoma;
		resultadoSoma = num1 + num2;
		return resultadoSoma;
	}
	
	public int subtracao (int num1, int num2) {
		int resultadoSub;
		resultadoSub = num1 - num2;
		return resultadoSub;
	}
	
	public double divisao (int num1, int num2) {
		double resultadoDiv;
		resultadoDiv = num2 / num1;
		return resultadoDiv;
	}
	
	public int multiplicacao (int num1, int num2) {
		int resultadoMultip;
		resultadoMultip = num2 * num1;
		return resultadoMultip;
	}
	
}
