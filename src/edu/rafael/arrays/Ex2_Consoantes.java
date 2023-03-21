/*
 * Este programa imprime as consoantes digitadas em uma Array
 * e sua quantidade
 */
package edu.rafael.arrays;
import java.util.Scanner;
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] vetor = new String[6];
        String letra = "", consoantes = "";
        int quantidadeConsoante = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o caractere: ");
            letra = leitor.next();

            if(!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
                
                    vetor[i] = letra;
                    quantidadeConsoante++;
                    consoantes = consoantes+" "+letra;
                            }
            }
            System.out.println("\nNumero de consoantes: "+quantidadeConsoante);
            System.out.println("Consoantes digitadas:"+consoantes);
            leitor.close();
        }
        
    }
