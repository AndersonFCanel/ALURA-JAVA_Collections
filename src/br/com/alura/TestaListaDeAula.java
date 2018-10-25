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
         * Como a classe Aula não possui um toString reescrito (_override_), ele utilizará o toString definido em Object, 
         * que retorna o nome da classe, concatenado com um @ e seguido de um identificador único do objeto. Algo como:
         * POR ISSO O MÉTODO toString FOI SOBRESCRITO NA CLASSE Aula
         * */
        System.out.println(aulas);
        
        System.out.println("\nAULA 2 - Comparando elementos na lista");
        /*E se quisermos ordenar essa lista de acordo com o tempo de uma aula? 
         * Poderíamos alterar o método compareTo, mas assim todas as ordenações de aulas seriam afetadas. 
         * Há uma forma bastante enxuta de se fazer isso utilizando os recursos do Java 8:
         * */
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
 
    }
}