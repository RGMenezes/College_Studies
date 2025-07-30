package Java.ProgramacaoOO.Aula.Exercicio10.model;

import java.util.*;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }   

    public String emprestarLivro(Livro livro) {
        if (!livro.getEmprestado()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
            return "Livro '" + livro.getTitulo() + "' emprestado com sucesso!";
        }
        return "Livro '" + livro.getTitulo() + "' já está emprestado!";
    }

    public String devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
            return "Livro '" + livro.getTitulo() + "' devolvido com sucesso!";
        }
        return "Livro '" + livro.getTitulo() + "' não está emprestado por " + nome + "!";
    }

    public String listarLivros(){
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Livros emprestados por ").append(nome).append(":\n");
        for (Livro livro : livrosEmprestados) {
            mensagem.append(livro.toString()).append("\n");
        }
        return mensagem.toString();
    }
}
