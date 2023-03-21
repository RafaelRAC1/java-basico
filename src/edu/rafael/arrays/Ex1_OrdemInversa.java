package edu.rafael.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6};
        String arrayInverso = "";

        for(int i = (vetor.length-1); i >= 0; i--){
            arrayInverso = arrayInverso+" "+vetor[i];
        }
        System.out.println("A ordem inversa do array é:"+arrayInverso);
    }
}
