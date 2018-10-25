package br.com.alura;

import java.util.List;

public class TestaCurso {

	public TestaCurso() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		/*
		 * O que vai sair aqui? O resultado � [], representando uma cole��o vazia. Faz
		 * sentido, pois inicializamos nossa lista de aulas com um new LinkedList que
		 * estar� vazio.
		 */
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
	

		/*
		 * E se eu adicionar uma aula no javaColecoes e imprimir novamente o resultado?
		 * Ser� que a vari�vel aulas continuar� vazia, j� que adicionamos a nova Aula
		 * dentro da lista do curso? Isso � apenas para refor�ar que trabalhamos aqui
		 * com refer�ncias. A vari�vel aulas se referencia para uma lista de objetos,
		 * que � a mesma que nosso atributo interno do curso em quest�o se referencia.
		 * Isto �, tanto javaColecoes.getAulas() quanto a nossa vari�vel tempor�ria
		 * aulas levam ao mesmo local, � mesma cole��o.
		 * 
		 * Tem gente que vai falar que "se mexeu numa vari�vel, mexeu na outra". N�o �
		 * bem isso. Na verdade, s�o duas vari�veis distintas mas que se referenciam ao
		 * mesmo objeto.
		 */
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		System.out.println(aulas);

		// alguns exemplos para refor�ar o que esta acima:
		System.out.println(javaColecoes.getAulas());
		if (aulas == javaColecoes.getAulas()) {
			System.out.println("OS OBJS S�O IGUAIS");
		} else {
			System.out.println("OS OBJETOS S�O DIFERENTES");
		}
		
		
		//==================================
		System.out.println("\nAULA 3 - parte 2");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		System.out.println(javaColecoes.getAulas());
	}
}
