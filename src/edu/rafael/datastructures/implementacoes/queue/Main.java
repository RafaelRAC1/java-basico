package edu.rafael.datastructures.implementacoes.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Motocicleta> queueMoto = new LinkedList<>();

        queueMoto.add(new Motocicleta("Yamaha"));
        queueMoto.add(new Motocicleta("Suzuki"));
        queueMoto.add(new Motocicleta("Honda"));

        System.out.println(queueMoto.add(new Motocicleta("Harley")));
        System.out.println(queueMoto);

        System.out.println(queueMoto.offer(new Motocicleta("Husqvarna")));
        // offer -> parecido com add, mas retorna falso se não conseguir executar
        // (enquanto add da erro)
        System.out.println(queueMoto);

        System.out.println(queueMoto.peek());// retorna o primeiro elemento sem remover
        System.out.println(queueMoto);

        System.out.println(queueMoto.poll());// retorna o primeiro elemento , mas remove
        System.out.println(queueMoto);

        System.out.println(queueMoto.isEmpty());

        System.out.println(queueMoto.size());

    }
}
