package Java.ProgramacaoOO.Aula.Exercicio10.model;

public class Livro {

    private String titulo;
    private String autor;
    private boolean emprestado;
    private static int totalLivros;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
        totalLivros++;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public static int getTotalLivros() {
        return totalLivros;
    }

    public void emprestar() {
        if (!this.emprestado) {
            this.emprestado = true;
        }
    }

    public void devolver() {
        if (this.emprestado) {
            this.emprestado = false;
        }
    }

    @Override
    public String toString() {
        return "Titulo='" + this.titulo + '\n' + "Autor='" + this.autor + '\n' + "Emprestado=" + this.emprestado;
    }
}