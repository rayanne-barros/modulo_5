package br.com.ada.pizzaria.model;

public class Produto {
    private String nome;
    private String preco;
    private String urlImagem;

    public Produto(String nome, String preco, String urlImagem) {
        this.nome = nome;
        this.preco = preco;
        this.urlImagem = urlImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
