package edu.rafael.datastructures.encadeamentodeno;

public class NoEncadeamento {
    private String conteudo;
    private NoEncadeamento proximoNo;

    public NoEncadeamento(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public NoEncadeamento getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoEncadeamento proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoEncademanto{" +
                "conteudo='" + conteudo + '\'' +
                '}';

    }

}
