package edu.rafael.datastructures.encadeamentodeno;

public class Main {
    public static void main(String[] args) {
        NoEncadeamento no1 = new NoEncadeamento("Conteudo no1");

        /*
         * Para realizar o cadeamento do no1 com o no2, será necessário
         * fazer a referência do próximo nó do nó1 e apontar para o no2.
         */

        NoEncadeamento no2 = new NoEncadeamento("Conteudo no2");
        no1.setProximoNo(no2);
        // neste caso, estamos apontando o valor do proximoNo de no1 para o
        // valor do no2

        NoEncadeamento no3 = new NoEncadeamento("Conteudo no3");
        no2.setProximoNo(no3);
        // agora, estamos apontando o valor do proximoNo de no2 para o
        // valor do no3
        NoEncadeamento no4 = new NoEncadeamento("Conteudo no4");
        no3.setProximoNo(no4);

        /*
         * Deste modo:
         * O no1 aponta para o no2
         * O no2 aponta para o no3
         * O no3 aponta para o no4
         * E o no4 aponta para null
         * 
         * Resumidamente:
         * no1 -> no2 -> no3 -> no4 -> null
         */

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        /*
         * Como é possível observar, ao imprimirmos no1, retorna-se
         * o conteudo dele, e ao imprimirmos o Proximo No,
         * o conteúdo presente no próximo nó (no2).
         * O mesmo se aplica para os demais nós.
         */

        System.out.println("--------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        /*
         * Ainda, podemos retornar o próximo nó e usá-lo para obter o valor
         * do nó posterior a ele.
         * Neste caso, estamos retornando o no2 e usando este para retornar
         * o valor do no3, e assim sucessivamente.
         */
    }
}
