package Java.ProgramacaoOO.Aula.Exercicio03.model.empregado;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    public String mostrarEmpregado() {
        return "Nome: " + nome + " " + sobrenome + "\nSalário Mensal: R$ " + salarioMensal;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salarioMensal += salarioMensal * (percentual / 100);
        }
    }
}
