
//Este programa calcula o fatorial de qualquer número inteiro

package edu.rafael.estruturasrepeticao;
import java.util.Scanner;
public class Ex6_Fatorial{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, total = 1;

        System.out.println("Digite o valor do número: ");
        numero = leitor.nextInt();

        for(int i = numero; i >= 1; i--){
            total = total * i;
        }

        System.out.println(numero+"! = "+total);
        leitor.close();
        }
        
    }