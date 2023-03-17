package edu.rafael.exemplos;
public class BoletimEstudantil {
    public static void main(String[] args){
    int mediaFinal = 6;
    
    //exemplo de código SEM IDENTAÇÃO, isto é, sem estar hirarquizado
    if(mediaFinal < 6){
    System.out.println("REPROVADO");
    } else if(mediaFinal == 6){
    System.out.println("PROVA MINERVA");
    } else {
    System.out.println("APROVADO");
    }
    }

    /*hierarquizado estaria mais ou menos assim:
    if(mediaFinal < 6){
        System.out.println("REPROVADO");
    } else if(mediaFinal == 6){
        System.out.println("PROVA MINERVA");
    } else {
        System.out.println("APROVADO");
    }
    }
    */

}