package com.dio;

import com.dio.model.gato;

public class primeiro {
	
	public static void main(String[] args) {
		
		gato gato = new gato();
		Livros livros = new Livro();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;*/
		System.out.println("Hello World!");
		
	}
	
}
class Livros {
	private String nome;
	private String npag;
}
