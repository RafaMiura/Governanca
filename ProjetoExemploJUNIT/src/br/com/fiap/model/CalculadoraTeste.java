package br.com.fiap.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void testesomar2com2() {
		
		//variáveis de comparação de resultado
		int resultadoReal = 0;
		int resultadoEsperado = 4;
		
		Calculadora calc = new Calculadora();
		resultadoReal = calc.soma(2, 2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
public void testesomar10com5() {
		
		//variáveis de comparação de resultado
		int resultadoReal = 0;
		int resultadoEsperado = 15;
		
		Calculadora calc = new Calculadora();
		resultadoReal = calc.soma(10, 5);
		assertEquals(resultadoReal, resultadoEsperado);
	

}

	@Test
public void testedividir100por10() {
		
		//variáveis de comparação de resultado
		double resultadoReal = 0;
		double resultadoEsperado = 1.5;
		
		Calculadora calc = new Calculadora();
		resultadoReal = calc.divisao(3, 2);
		assertEquals(resultadoReal, resultadoEsperado, 0.6);
	

}
	
}