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
	 * Uma LinkedList? Qual � a diferen�a dela para uma ArrayList? Voc� vai ver que
	 * vamos utiliz�-la da mesma forma que uma ArrayList Repare que, em vez de
	 * declararmos a refer�ncia a uma ArrayList<Aula> (ou LinkedList<Aula>),
	 * deixamos mais gen�rico, utilizando a interface List. Por qu�? Pelo motivo que
	 * j� vimos ao estudar orienta��o a objetos aqui no Alura: n�o temos motivo para
	 * ser super espec�fico na inst�ncia que iremos usar. Se for�armos ArrayList na
	 * refer�ncia, certamente teremos problema o dia que precisarmos trocar essa
	 * lista. Se declararmos apenas como List, poderemos mudar de implementa��o,
	 * como para uma LinkedList, sem problema algum de compila��o, por n�o termos
	 * nos comprometido com uma implementa��o em espec�fico. Fique tranquilo se voc�
	 * ainda n�o est� convencido dessas vantagens. Com tempo de programa��o e de
	 * pr�tica em orienta��o a objetos isso ficar� mais claro.
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
		 * podemos devolver essa c�pia de tal forma que ela n�o possa ser alterada, ou
		 * seja, que ela seja n�o modific�vel, usando o m�todo
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
		//Mesmo c�digo acima usando straem api
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas: + " + this.aulas + "]";
	}
}
