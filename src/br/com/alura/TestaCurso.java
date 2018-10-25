package br.com.alura;

import java.util.List;

public class TestaCurso {

	public TestaCurso() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		/*
		 * O que vai sair aqui? O resultado é [], representando uma coleção vazia. Faz
		 * sentido, pois inicializamos nossa lista de aulas com um new LinkedList que
		 * estará vazio.
		 */
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
	

		/*
		 * E se eu adicionar uma aula no javaColecoes e imprimir novamente o resultado?
		 * Será que a variável aulas continuará vazia, já que adicionamos a nova Aula
		 * dentro da lista do curso? Isso é apenas para reforçar que trabalhamos aqui
		 * com referências. A variável aulas se referencia para uma lista de objetos,
		 * que é a mesma que nosso atributo interno do curso em questão se referencia.
		 * Isto é, tanto javaColecoes.getAulas() quanto a nossa variável temporária
		 * aulas levam ao mesmo local, à mesma coleção.
		 * 
		 * Tem gente que vai falar que "se mexeu numa variável, mexeu na outra". Não é
		 * bem isso. Na verdade, são duas variáveis distintas mas que se referenciam ao
		 * mesmo objeto.
		 */
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		System.out.println(aulas);

		// alguns exemplos para reforçar o que esta acima:
		System.out.println(javaColecoes.getAulas());
		if (aulas == javaColecoes.getAulas()) {
			System.out.println("OS OBJS SÃO IGUAIS");
		} else {
			System.out.println("OS OBJETOS SÃO DIFERENTES");
		}
		
		
		//==================================
		System.out.println("\nAULA 3 - parte 2");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		System.out.println(javaColecoes.getAulas());
	}
}
