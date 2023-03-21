/*Este programa calcula a tabuada de qualquer número inteiro
 * entre 0 e 10
 */
package edu.rafael.estruturasrepeticao;
import java.util.Scanner;
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número da tabuada: ");
        numero = leitor.nextInt();

        //estrutura de repetição caso o usuário digite número invalido
        while(numero > 10 || numero < 1){
            System.out.println("Número inválido. Digite um número entre 1 e 10: ");
            numero = leitor.nextInt();
        }

        System.out.println("\nTabuada do "+numero);

        for(int i = 1; i <= 10; i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
        
        leitor.close();
    }
}
