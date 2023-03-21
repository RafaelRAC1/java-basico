/*
 * Este programa recebe interos aleatórios entre 0 e 100 
 * para 20 posições de uma array, imprimindo a array, 
 * uma array com valores sucessores a ela e outra com
 * valores antecessores.
 */
package edu.rafael.arrays;
import java.util.Random;
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[20];

        System.out.print("Números Aleatórios:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100);
           System.out.print(" "+vetor[i]);
        }

        System.out.print("\nSucessor dos Números Aleatórios:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(" "+(vetor[i]+1));
        }
        
        System.out.print("\nAntecessor dos Números Aleatórios:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(" "+(vetor[i]-1));
        }
    }
}
