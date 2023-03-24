package edu.rafael.datastructures.implementacoes.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {

        List<Motocicleta> listaMoto = new ArrayList<Motocicleta>();

        listaMoto.add(new Motocicleta("Yamaha"));
        listaMoto.add(new Motocicleta("Suzuki"));
        listaMoto.add(new Motocicleta("Honda"));
        listaMoto.add(new Motocicleta("Harley"));

        System.out.println(listaMoto.contains(new Motocicleta("Yamaha")));

        System.out.println(listaMoto.get(2));

        System.out.println(listaMoto.indexOf(new Motocicleta("Honda")));

        System.out.println(listaMoto.remove(2));
        System.out.println(listaMoto);
    }
}
