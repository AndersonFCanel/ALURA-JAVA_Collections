package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {
    	System.out.println("AULA 2 - Adicionando elementos a lista:");
        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        
        /*
         * Como a classe Aula n�o possui um toString reescrito (_override_), ele utilizar� o toString definido em Object, 
         * que retorna o nome da classe, concatenado com um @ e seguido de um identificador �nico do objeto. Algo como:
         * POR ISSO O M�TODO toString FOI SOBRESCRITO NA CLASSE Aula
         * */
        System.out.println(aulas);
        
        System.out.println("\nAULA 2 - Comparando elementos na lista");
        /*E se quisermos ordenar essa lista de acordo com o tempo de uma aula? 
         * Poder�amos alterar o m�todo compareTo, mas assim todas as ordena��es de aulas seriam afetadas. 
         * H� uma forma bastante enxuta de se fazer isso utilizando os recursos do Java 8:
         * */
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
 
    }
}