package edu.rafael.datastructures.implementacoes.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Motocicleta> listaMotocicletas = new ArrayList<>();

        listaMotocicletas.add(new Motocicleta("Yamaha"));
        listaMotocicletas.add(new Motocicleta("Suzuki"));
        listaMotocicletas.add(new Motocicleta("Honda"));
        listaMotocicletas.add(new Motocicleta("Harley"));

        System.out.println(listaMotocicletas.contains(new Motocicleta("Yamaha")));
        System.out.println((new Motocicleta("Yamaha").hashCode()));
        System.out.println((new Motocicleta("Yamaha1").hashCode()));

        Motocicleta moto1 = new Motocicleta("Suzuki");
        Motocicleta moto2 = new Motocicleta("Honda");

        System.out.println(moto1.equals(moto2));

    }
}
