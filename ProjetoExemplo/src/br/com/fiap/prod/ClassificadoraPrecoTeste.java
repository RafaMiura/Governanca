package br.com.fiap.prod;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.After;


import org.junit.Test;

//Classe de teste da Classificadora de preços de produtos 

public class ClassificadoraPrecoTeste {

	
	public static int contadorTeste = 1;
	
	@Before
	public void preparacaoTeste() {
		System.out.println("Começando o teste " + contadorTeste);
	}
	
	@After
	public void finalizacaoTeste() {
		System.out.println("Terminando o teste " + contadorTeste);
		contadorTeste += contadorTeste;
	}
//Método de avaliação da ordenação correta de produtos e preços 

	@Test

	public void testeClassificacaoPrecosProdutos1() {

//Inicializa a lista a ser ordenada 

		Produto produto1 = new Produto("Banana", 19);

		Produto produto2 = new Produto("Amora", 20);

		Produto produto3 = new Produto("Amora", 12);

		Produto produto4 = new Produto("Banana", 15);

//Cria a lista de produtos e preços a serem ordenados 

		List<Produto> produtosPrecos = Arrays.asList(

				produto1,

				produto2,

				produto3,

				produto4

		);

//Cria a lista de resultado esperado da ordenação de preços e produtos 

		List<Produto> produtosNaOrdemEsperada = Arrays.asList(

				produto3,

				produto2,

				produto4,

				produto1

		);

//Cria o Objeto na classe Classificadora de precos e produtos e chama o método de ordenação 

		ClassificadoraPreco classificadora = new ClassificadoraPreco();

		List<Produto> produtosOrdenados = classificadora.classificaProdutosPorPreco(produtosPrecos);

		// Comparação de resultado com o comando assertArrayEquals

		assertArrayEquals(produtosNaOrdemEsperada.toArray(), produtosOrdenados.toArray());

	}

	@Test

	public void testeClassificacaoPrecosProdutos2() {

//Inicializa a lista a ser ordenada 

		Produto produto1 = new Produto("Laranja", 12);

		Produto produto2 = new Produto("Pera", 18);

		Produto produto3 = new Produto("Amora", 12);

		Produto produto4 = new Produto("Banana", 15);

//Cria a lista de produtos e preços a serem ordenados 

		List<Produto> produtosPrecos = Arrays.asList(

				produto1,

				produto2,

				produto3,

				produto4

		);

//Cria a lista de resultado esperado da ordenação de preços e produtos 

		List<Produto> produtosNaOrdemEsperada = Arrays.asList(

				produto3,

				produto4,

				produto1,

				produto2

		);

//Cria o Objeto na classe Classificadora de precos e produtos e chama o método de ordenação 

		ClassificadoraPreco classificadora = new ClassificadoraPreco();

		List<Produto> produtosOrdenados = classificadora.classificaProdutosPorPreco(produtosPrecos);

		// Comparação com uso de LOOP de assertEquals

		for (int i = 0; i < produtosNaOrdemEsperada.size(); i++) {

			assertEquals(produtosNaOrdemEsperada.get(i).codigo, produtosOrdenados.get(i).codigo);

			assertEquals(produtosNaOrdemEsperada.get(i).preco, produtosOrdenados.get(i).preco, 0); // Neste caso,
																									// aceita-se uma
																									// variação de até 0
																									// na dízima entre o
																									// real e o esperado

		}

	}

}