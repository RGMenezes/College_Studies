package Java.ProgramacaoOO.Aula.Exercicio03.model.fatura;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double preco;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidadeComprada() {
        return quantidadeComprada > 0 ? quantidadeComprada : 0;
    }
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
    public double getPreco() {
        return preco > 0 ? preco : 0.0;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotalFatura() {
        return quantidadeComprada * preco;
    }
}
