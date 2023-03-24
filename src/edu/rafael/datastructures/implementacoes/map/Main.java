package edu.rafael.datastructures.implementacoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // hashmap
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Rafael");
        aluno.put("Idade", "18");
        aluno.put("Media", "7.5");
        aluno.put("Turma", "3f");

        System.out.println(aluno);

        System.out.println(aluno.keySet());// retorna todas as chaves
        System.out.println(aluno.values());// retorna todas os valores

        List<Map<String, String>> listaAluno = new ArrayList<>();
        listaAluno.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Emereson");
        aluno2.put("Idade", "15");
        aluno2.put("Media", "9.5");
        aluno2.put("Turma", "3a");

        listaAluno.add(aluno2);

        System.out.println(listaAluno);

        System.out.println(aluno.containsKey("Nome"));// verifica se possui a chave

    }
}
