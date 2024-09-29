package br.edu.unisep.biblioteca.model;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        livro.setDisponivel(false);
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void devolverLivro() {
        livro.setDisponivel(true);
    }

    @Override
    public String toString() {
        return "Empréstimo: br.edu.unisep.biblioteca.model.Livro [" + livro.getTitulo() + "], Usuário [" + usuario.getNome() + "], Data de Empréstimo: "
                + dataEmprestimo + ", Data Prevista de Devolução: " + dataDevolucaoPrevista;
    }
}
