package br.com.alura;

public class Aula implements Comparable<Aula>{

	public Aula() {
		// TODO Auto-generated constructor stub
	}
	
	private String  titulo;
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
    
    
    /*Reescrevendo nosso toString para trabalhar bem com a lista
	Vamos então reescrever nosso método toString da classe Aula, para que ele retorne algo significativo:
     * */
    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }
    
    
    /*
     * Diferente de uma String ou de tipos primitivos mais simples, o Collections.sort não sabe ordenar uma lista de Aula. 
     * De qual forma ele faria isso? Pelo nome da aula? Pela duração? Não daria para saber. 
     * Para que ele seja capaz de fazer isso, você precisa implementar a interface Comparable definindo um critério de comparação para os objetos desse tipo. 
     * Faça com que a classe Aula implemente essa interface e execute a classe TestaListaDeAula para verificar se a ordenação funcionou.
     * */
    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }
}
