package br.com.dio;

import br.com.dio.model.cat;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		
		cat gato = new cat();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		/*int a = 2;
		int b = 3;
		System.out.println("Hello world" + (a+b));*/

	}

}

class Livros {
	private String nome;
	private String npag;
}