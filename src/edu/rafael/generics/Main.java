
package edu.rafael.generics;

public class Main {
    public static void main(String[] args) {
        /*
        Após atribuir o tipo genérico, basta indicar entre chaves na String o 
        tipo do objeto.
         */
        NoEncadeamento<String> no1 = new NoEncadeamento<>("Conteudo no1"); 
        
        NoEncadeamento<String> no2 = new NoEncadeamento<>("Conteudo no2"); 
        no1.setProximoNo(no2);

        NoEncadeamento<String> no3 = new NoEncadeamento<>("Conteudo no3"); 
        no2.setProximoNo(no3);

        NoEncadeamento<String> no4 = new NoEncadeamento<>("Conteudo no4"); 
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("--------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
