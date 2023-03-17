package edu.rafael.exemplos;
public class MinhaClasse {
    public static void main(String[] args){
        /* 
        final String NOME = "Rafael"; A nomenclatura uppercase indica que é FINAL, ou seja, não altera.
        final Double PI = 3.14;
        final int ANO_2000 = 2000;
        boolean verdadeiro = true;
        boolean condicao;
        */
        String primeiroNome = "Rafael";
        String segundoNome = "Corrêa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    //Como criar um método e nomear:
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "O resultado do método é: "+primeiroNome.concat(" ").concat(segundoNome);
    }
}
