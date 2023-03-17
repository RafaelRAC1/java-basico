package edu.rafael.terminal;

public class AboutMe {
    public static void main(String[] args) {
        //este programa demonstra a possibilidade de enviar
        //valores através do terminal.
        //por isso o array string, como no metodo main
        String nome = args[0];
        String sobrenome = args[0];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo "+nome+" "+sobrenome);
        System.out.println("Tenho "+idade+" anos");
        System.out.println("Minha altura é "+altura+"cm");

    }
    
}