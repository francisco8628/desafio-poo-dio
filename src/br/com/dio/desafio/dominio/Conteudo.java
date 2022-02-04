package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO=18d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();  //obriga os filhos a implemantar este metodo

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
