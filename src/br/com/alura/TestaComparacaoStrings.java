package br.com.alura;

public class TestaComparacaoStrings {

	public static void main(String[] args) {

		String s1 = "paulo";
		String s2 = "silveira";
		int resultado = s1.compareTo(s2);

		System.out.println(resultado);

		/*
		 * COMO FAZER A COMPARA��O:
		 * 
		 * @Override
		 *  public int compareTo(Aula outraAula) {
		 *   // o que colocar aqui? 
		 *   } 
		 *   
		 *   � a� que devemos decidir o nosso crit�rio de compara��o de duas aulas. Quando
		 * uma aula vir� antes da outra? Bem, eu vou optar por ordenar na ordem
		 * alfab�tica. Para isso, vou aproveitar do pr�prio m�todo compareTo da String,
		 * delegando:
		 * 
		 */
	}
}