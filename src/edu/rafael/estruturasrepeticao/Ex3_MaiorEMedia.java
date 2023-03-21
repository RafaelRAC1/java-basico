package edu.rafael.estruturasrepeticao;
import java.util.Scanner;

public class Ex3_MaiorEMedia{
    public static void main(String[] args) {
        //o objetivo deste programa é ler cinco números, calcular a média 
        //e imprimir o maior número e a média;

        int numero, media = 0, maior = 0;
        Scanner leitor = new Scanner(System.in);
        //utilizando do-while para a repetição do input
        int count = 1;
        do {
            System.out.println("Digite o numero "+count+": ");
            numero = leitor.nextInt();

            media += numero;
            maior = Math.max(numero, maior);
            count++;

            System.out.println("Maior: "+maior);
            System.out.println("Soma: "+media);
        }while(count <= 5);

        System.out.println("\nA média é: "+(media/5));
        System.out.println("O maior número é: "+(maior));
        leitor.close();
    }
}