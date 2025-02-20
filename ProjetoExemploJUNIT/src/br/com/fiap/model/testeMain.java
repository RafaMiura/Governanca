package br.com.fiap.model;

public class testeMain {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Valor da soma:" + " " + calculadora.soma(5, 5));
		System.out.println("Valor da subtracao:" + " " + calculadora.subtracao(10, 5));
		System.out.println("Valor da divisao:" + " " + calculadora.divisao(1, 2));
		System.out.println("Valor da multiplicacao:" + " " + calculadora.multiplicacao(4, 5));
	}

}
