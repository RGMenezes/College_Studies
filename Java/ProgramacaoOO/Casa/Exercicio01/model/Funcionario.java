package Java.ProgramacaoOO.Casa.Exercicio01.model;

public class Funcionario {
    public String nome;
    public String departamento;
    public double salario;
    public String dataEntrada;
    public String rg;
    public boolean estaNaEmpresa;

    public void registrar(String nome, String departamento, double salario, String dataEntrada, String rg, boolean estaNaEmpresa){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public double bonifica(double aumento){
        this.salario += aumento;
        return this.salario;
    }

    public void demite(){
        this.estaNaEmpresa = false;
    }

    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
        System.out.println("Está na empresa: " + (estaNaEmpresa ? "Sim" : "Não"));
    }
}
