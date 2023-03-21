        /*este programa determina a quantidade de números pares e impares
        dentro do total de números especificados pelo usuário*/
package edu.rafael.estruturasrepeticao;
import java.util.Scanner;
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        int numero, quantNumeros = 0, par = 0, impar = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade de números a contar: ");
        quantNumeros = leitor.nextInt();

        for(int i = 0; i < quantNumeros; i++){
            System.out.println("Digite o número "+(i+1)+": ");
            numero = leitor.nextInt();
            if(numero%2 == 0) ++par; else ++impar;
            //condicional para validar se o número é par ou impar.
            //o módulo de qualquer número par sempre será zero.
        }

        System.out.println("\nQtde. número par: "+par);
        System.out.println("Qtde. número impar: "+impar);
        leitor.close();
    }
}