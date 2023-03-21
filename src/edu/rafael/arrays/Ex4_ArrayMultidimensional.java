package edu.rafael.arrays;
import java.util.Random;
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] vetor = new int[4][4];

        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor[i].length; j++){
                vetor[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for(int[] linha : vetor){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }
}
