package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	public Curso() {
		// TODO Auto-generated constructor stub
	}

	private String nome;
	private String instrutor;

	/*
	 * Uma LinkedList? Qual é a diferença dela para uma ArrayList? Você vai ver que
	 * vamos utilizá-la da mesma forma que uma ArrayList Repare que, em vez de
	 * declararmos a referência a uma ArrayList<Aula> (ou LinkedList<Aula>),
	 * deixamos mais genérico, utilizando a interface List. Por quê? Pelo motivo que
	 * já vimos ao estudar orientação a objetos aqui no Alura: não temos motivo para
	 * ser super específico na instância que iremos usar. Se forçarmos ArrayList na
	 * referência, certamente teremos problema o dia que precisarmos trocar essa
	 * lista. Se declararmos apenas como List, poderemos mudar de implementação,
	 * como para uma LinkedList, sem problema algum de compilação, por não termos
	 * nos comprometido com uma implementação em específico. Fique tranquilo se você
	 * ainda não está convencido dessas vantagens. Com tempo de programação e de
	 * prática em orientação a objetos isso ficará mais claro.
	 */
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		// return aulas;
		/*
		 * podemos devolver essa cópia de tal forma que ela não possa ser alterada, ou
		 * seja, que ela seja não modificável, usando o método
		 * Collections.unmodifiableList:
		 */
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		// int tempoTotal = 0;
		/*
		 * for (Aula aula : aulas) { tempoTotal += aula.getTempo(); }
		 */
		// return tempoTotal;
		//Mesmo código acima usando straem api
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas: + " + this.aulas + "]";
	}
}
