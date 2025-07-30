package Java.ProgramacaoOO.Aula.Exercicio10.view;

import Java.ProgramacaoOO.Aula.Exercicio10.model.Livro;
import Java.ProgramacaoOO.Aula.Exercicio10.model.Usuario;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro l2 = new Livro("1984", "George Orwell");
        Usuario u1 = new Usuario("Renata");
        u1.emprestarLivro(l1);
        u1.emprestarLivro(l2);
        u1.listarLivros();
        u1.devolverLivro(l1);
        u1.listarLivros();
        System.out.println("Total de livros cadastrados: " + Livro.getTotalLivros() + "\n");


        System.out.println(l1.toString() + "\n");
        System.out.println(l2.toString() + "\n");
        System.out.println(u1.listarLivros());
    }
}
