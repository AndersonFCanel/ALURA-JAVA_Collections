package br.com.alura;

public class TestaComparacaoStrings {

	public static void main(String[] args) {

		String s1 = "paulo";
		String s2 = "silveira";
		int resultado = s1.compareTo(s2);

		System.out.println(resultado);

		/*
		 * COMO FAZER A COMPARAÇÃO:
		 * 
		 * @Override
		 *  public int compareTo(Aula outraAula) {
		 *   // o que colocar aqui? 
		 *   } 
		 *   
		 *   É aí que devemos decidir o nosso critério de comparação de duas aulas. Quando
		 * uma aula virá antes da outra? Bem, eu vou optar por ordenar na ordem
		 * alfabética. Para isso, vou aproveitar do próprio método compareTo da String,
		 * delegando:
		 * 
		 */
	}
}