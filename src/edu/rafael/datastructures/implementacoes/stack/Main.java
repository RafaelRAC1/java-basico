package edu.rafael.datastructures.implementacoes.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // stack == pilha
        Stack<Motocicleta> stackMotos = new Stack<Motocicleta>();

        stackMotos.push(new Motocicleta("Yamaha"));
        stackMotos.push(new Motocicleta("Suzuki"));
        stackMotos.push(new Motocicleta("Honda"));

        System.out.println(stackMotos);
        System.out.println(stackMotos.pop());
        System.out.println(stackMotos);

        System.out.println(stackMotos.peek());
        System.out.println(stackMotos);

        System.out.println(stackMotos.empty());

    }
}
