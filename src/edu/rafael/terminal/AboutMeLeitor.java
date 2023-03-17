package edu.rafael.terminal;

import java.util.Scanner;
import java.util.Locale;

public class AboutMeLeitor{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        //input de dados
        System.out.println("Digite o seu nome: ");
        String nome = leitor.next();

        System.out.println("\nDigite o seu sobrenome: ");
        String sobrenome = leitor.next();

        System.out.println("\nDigite a sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("\nDigite a sua altura: ");
        Double altura = leitor.nextDouble();
        //output de dados
        System.out.println("\nOlá, me chamo "+nome+" "+sobrenome);
        System.out.println("Tenho "+idade+" anos");
        System.out.println("Minha altura é "+altura+"cm");
        leitor.close();
    }
}
