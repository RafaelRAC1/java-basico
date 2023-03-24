package edu.rafael.datastructures.implementacoes.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // hashset não preserva a ordem de inserção
        Set<Motocicleta> hashsetMoto = new HashSet<>();

        hashsetMoto.add(new Motocicleta("Yamaha"));
        hashsetMoto.add(new Motocicleta("Suzuki"));
        hashsetMoto.add(new Motocicleta("Honda"));
        hashsetMoto.add(new Motocicleta("Harley"));
        hashsetMoto.add(new Motocicleta("BMW"));
        hashsetMoto.add(new Motocicleta("Zeitung"));

        // System.out.println(hashsetMoto);

        Set<Motocicleta> treeSetMoto = new TreeSet<>();// como é uma arvore, precisa do comparable
        treeSetMoto.add(new Motocicleta("Yamaha"));
        treeSetMoto.add(new Motocicleta("Suzuki"));
        treeSetMoto.add(new Motocicleta("Honda"));
        treeSetMoto.add(new Motocicleta("Harley"));
        treeSetMoto.add(new Motocicleta("BMW"));
        treeSetMoto.add(new Motocicleta("Zeitung"));

        System.out.println(treeSetMoto);
    }
}
