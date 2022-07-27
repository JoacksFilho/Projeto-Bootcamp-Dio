package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    // classe abstrata para poder implementar o metodo calcular xp
    // nas classes filhas...
    protected static final double XP_PADRAO = 10;
    //final define como uma constante

    private String titulo;
    private String descricao;

    public abstract double calcular_xp();

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
