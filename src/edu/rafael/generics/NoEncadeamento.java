/*
  O T representa uma classe genérica.

    Exemplo:
    public class Lista<T>{
        private T t;
    }

    Podemos, assim, entrar com uma integer, String, etc.
    Os generics são utilizados para:
    - evitar casting excessivo (mudança de tipo) e codigo reduntante;
    - identificar erros de compilação.
 */
package edu.rafael.generics;

public class NoEncadeamento<T> {
    private T conteudo;
    private NoEncadeamento<T> proximoNo;

    public NoEncadeamento(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public NoEncadeamento<T> getProximoNo(){
        return proximoNo;
    }

    public void setProximoNo(NoEncadeamento<T> proximoNo){
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString(){
        return "NoEncademanto{" +
            "conteudo='"+conteudo+'\''+
            '}';

    }

    }

