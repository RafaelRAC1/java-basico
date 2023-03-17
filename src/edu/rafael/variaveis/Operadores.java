package edu.rafael.variaveis;

public class Operadores {
    public static void main(String[] args){
        //Demonstrando funcionamento funcionando do operador de atribuição e adição/concatenação
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";//Realiza a operação de adição e depois concatena o caractere.
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);/*Usando a evidência, ele realiza a concatenação 
        do resultado da operação com o caractere*/
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;//Neste caso, como identificou um caractere entre dois números, apenas concatenou
        System.out.println(concatenacao);

        concatenacao = 1+1+"1"+1;//Mesma situação do caso anterior.
        System.out.println(concatenacao);

        //-------------------------------------------------------------
        
        //Demonstrantando funcionamento do operador unário negativo e incremental/decremental
        int numero = 5;
        
        numero = -numero;
        System.out.println(numero);

        //Convertendo o valor para positivo
        numero = numero * -1;
        System.out.println(numero);

        //Demonstrando operação de incremento e decremento de número;
        int incremento = 3;
        
        incremento++;//Mesmo que incremento + 1;
        System.out.println(incremento);/*Outra forma seria (++incremento), pois 
        assim incrementaria antes de imprimir*/

        incremento = 3;
        incremento--;//Mesmo que incremento - 1;
        System.out.println(incremento);//Outra forma seria (--incremento), pois assim decrementaria antes de imprimir

        //-------------------------------------------------------------
        
        //Demonstrantando funcionamento do operador de negação
        boolean logico = true;

        System.out.println(!logico);
        //ou
        logico = !logico;
        System.out.println(logico);

        //-------------------------------------------------------------
        
        //Demonstrantando funcionamento do operador ternário
        int a = 8;
        String resultado = (a>6?"Maior":"Menor");
        System.out.println(resultado);

        //-------------------------------------------------------------
        
        //Demonstrantando funcionamento dos operadores relacionais
        int num1 = 1;
        int num2 = 2;
        boolean simNao = num1==num2;
        System.out.println("num1 é igual a num2? "+simNao);

        simNao = num1!=num2;
        System.out.println("num1 é diferente de num2? "+simNao);

        simNao = num1>=num2;
        System.out.println("num1 é maior ou igual a num2? "+simNao);

        //Usando String
        String nome1 = "Joao";
        String nome2 = "Joao";
        System.out.println("Os nomes são iguais? "+(nome1 == nome2));

        //Usando Objeto
        nome1 = "Joao";
        nome2 = new String("Joao");
        System.out.println("Os nomes são iguais? "+nome1.equals(nome2));
        /*O equals é usando pois a string está sendo comparada a um valor de um objeto
        Sem o equals, o resultado seria false*/

        //-------------------------------------------------------------
        
        //Demonstrantando funcionamento dos operadores lógicos
        int valor1 = 1;
        int valor2 = 2;
        boolean resultado1 = valor1>0 && valor1<valor2;//tem que dar true, pois ambas condições são verdadeiras
        System.out.println("O resultado da condição é: "+resultado1);

        resultado1 = valor1>0 || valor1>valor2;//tem que dar true, pois uma das condições é verdadeira.
        System.out.println("O resultado da condição é: "+resultado1);
    }
}