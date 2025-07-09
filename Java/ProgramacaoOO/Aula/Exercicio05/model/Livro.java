package Java.ProgramacaoOO.Aula.Exercicio05.model;

public class Livro {
    private String _titulo;
    private String _autor;
    private boolean _disponivel;

    public Livro(String titulo, String autor) {
        this._titulo = titulo;
        this._autor = autor;
        this._disponivel = true;
    }
    
    public void emprestar(){
        this._disponivel = false;
    }

    public void devolver(){
        this._disponivel = true;
    }

    public String exibirInfo() {
        String disponibilidade = this._disponivel ? "Disponível" : "Indisponível";
        return String.format("Título: %s\n Autor: %s\n Status: %s", this._titulo, this._autor, disponibilidade);
    }

    public boolean estaDisponivel() {
        return this._disponivel;
    }

}
