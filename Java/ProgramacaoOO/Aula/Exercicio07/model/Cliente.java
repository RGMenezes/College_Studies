package Java.ProgramacaoOO.Aula.Exercicio07.model;

public class Cliente {
    private String nome;
    private String cpf;
    private double rendaMensal;
    private Endereco endereco;
    

    public Cliente(String nome, String cpf, double rendaMensal){
        this.nome = nome;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }
    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String avaliarCliente(){
        return (rendaMensal > 1518) ? "Aprovado" : "Reprovado";
    }

    public String mostrarDados(){
        return "Nome: " + nome + "\nCPF: " + cpf + "\nRenda Mensal: " + rendaMensal;
    }
}
