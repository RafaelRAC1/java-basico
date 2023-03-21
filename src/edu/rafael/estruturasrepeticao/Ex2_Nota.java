package edu.rafael.estruturasrepeticao;
import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Double nota = 0.00;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        nota = leitor.nextDouble();

        while((nota < 0) || (nota > 10)){
            System.out.println("\nInforme um valor válido. Digite novamente: ");
            nota = leitor.nextDouble();
        }
        
        leitor.close();

    }
}