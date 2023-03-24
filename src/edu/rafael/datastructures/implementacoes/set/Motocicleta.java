package edu.rafael.datastructures.implementacoes.set;

import java.util.Objects;

public class Motocicleta implements Comparable<Motocicleta> {
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

    /*
     * @Override
     * public int compareTo(Motocicleta o) {
     * if(this.marca.length() < o.marca.length()){
     * return -1;
     * } else if(this.marca.length() > o.marca.length()){
     * return 1;
     * }
     * return 0;
     * }
     * //ordena da marca de menor
     * //caractere para a de maior.
     */

    @Override
    public int compareTo(Motocicleta o) {
        return this.marca.compareTo(o.getMarca());
    } // organiza em ordem alfabetica
}
