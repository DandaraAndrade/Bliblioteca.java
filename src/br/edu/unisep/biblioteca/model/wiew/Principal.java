package br.edu.unisep.biblioteca.model.wiew;

import br.edu.unisep.biblioteca.model.Livro;

import javax.swing.*;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("George Orwell");

        Livro livro = new Livro();
        livro.setId(1);
        livro.setTitulo("1984");
        livro.setIsbn("123456789");
        livro.setAutor(autor);
        livro.setDisponivel(true);

        Usuario usuario = new Usuario();
        usuario.setNome("Ana Silva");
        usuario.setMatricula("20221001");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataEmprestimo(LocalDate.now());
        emprestimo.setDataDevolucaoPrevista(LocalDate.now().plusDays(14));

        System.out.println(Livro);
        JOptionPane.showMessageDialog(
                null,livro);
    }
}

