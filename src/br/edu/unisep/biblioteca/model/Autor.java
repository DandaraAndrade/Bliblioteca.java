package br.edu.unisep.biblioteca.model;

public class Autor {
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "br.edu.unisep.biblioteca.model.Autor: " + nome;
    }
}
