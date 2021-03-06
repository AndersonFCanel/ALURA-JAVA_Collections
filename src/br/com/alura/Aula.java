package br.com.alura;

/*O implements comparable serve para implementar a compara��o de Aulas, note que o m�todo compareTo
 *  foi reescrito possibilitando a compara��o por nome, se n�o fosse assim o compareTo n�o saberia comparar uma aula a outra
 *  */

public class Aula implements Comparable<Aula> {

	public Aula() {
		// TODO Auto-generated constructor stub
	}

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	/*
	 * Reescrevendo nosso toString para trabalhar bem com a lista Vamos ent�o
	 * reescrever nosso m�todo toString da classe Aula, para que ele retorne algo
	 * significativo:
	 */
	// Como Aula � um objeto e tem diversas propriedades(Atributos) esse tipo de
	// sobrescrita do
	// toString possibilita a "entrega" desse return customizado
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	/*
	 * Diferente de uma String ou de tipos primitivos mais simples, o
	 * Collections.sort n�o sabe ordenar uma lista de Aula. De qual forma ele faria
	 * isso? Pelo nome da aula? Pela dura��o? N�o daria para saber. Para que ele
	 * seja capaz de fazer isso, voc� precisa implementar a interface Comparable
	 * definindo um crit�rio de compara��o para os objetos desse tipo. Fa�a com que
	 * a classe Aula implemente essa interface e execute a classe TestaListaDeAula
	 * para verificar se a ordena��o funcionou.
	 */
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}
}
