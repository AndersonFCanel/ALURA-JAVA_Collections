package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public TestandoListas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("AULA 1");
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		// criando uma lista genérica
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println("IMPRIMINDO A LISTA");
		System.out.println(aulas);

		// REMOVENDO ELEMENTOS POR INDEX
		aulas.remove(0);
		System.out.println("\n\nREMOVENDO ELEMENTOS POR INDEX");
		System.out.println(aulas);

		// PERCORRENDO A LISTA COM FOREACH
		System.out.println("\n\nITERANDO A LISTA");
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		System.out.println("\n\n");
		System.out.println("TAMANHO DO ARRAY: " + aulas.size());
		// ACESSANDO ELEMENTOS PELO INDEX
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("ELEMENTO " + i + " - " + aulas.get(i));
		}

		// Mais uma forma de percorrer elementos, agora com Java 8
		System.out.println("\n\n");
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aula);
		});
		
		//Ordenando a lista
		System.out.println("\n\n");
		Collections.sort(aulas);
		System.out.println("Depois de ordenado:");
        System.out.println(aulas);  
	}
}
