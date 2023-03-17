package edu.rafael.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        //testando os metodos desenvolvido
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal vigente: "+smartTv.canal);

        smartTv.selecionarCanal(23);

        System.out.println("Canal vigente: "+smartTv.canal);

        System.out.println("A TV está ligada? "+smartTv.ligada);
        System.out.println("Canal vigente: "+smartTv.canal);
        System.out.println("Volume da TV: "+smartTv.volume);

        smartTv.ligar();

        System.out.println("A TV está ligada? "+smartTv.ligada);
        System.out.println("Canal vigente: "+smartTv.canal);
        System.out.println("Volume da TV: "+smartTv.volume);

        smartTv.desligar();

        System.out.println("A TV está ligada? "+smartTv.ligada);
        System.out.println("Canal vigente: "+smartTv.canal);
        System.out.println("Volume da TV: "+smartTv.volume);

    }
}