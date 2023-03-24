package edu.rafael.datastructures.implementacoes.list;

import java.util.Objects;

public class Motocicleta {
    String marca;

    public Motocicleta(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Motocicleta)) {
            return false;
        }
        Motocicleta motocicleta = (Motocicleta) o;
        return Objects.equals(marca, motocicleta.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marca);
    }

    @Override
    public String toString() {
        return "{" +
                " marca='" + getMarca() + "'" +
                "}";
    }

}
