package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public TestaCurso2() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		System.out.println("\nAULA 4");
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		//A c�pia do array se devido a utiliza��o do unmodifiable list em cursos
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        
       //Com base no coment�rio acima, essa � a forma segura de ordenar essa lista
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        
        System.out.println(javaColecoes);

	}
}
