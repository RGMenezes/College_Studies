package Java.ProgramacaoOO.Casa.Exercicio02.model;

public class Conta {
    double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valorBruto) {
        double valor = valorBruto * 1.05;
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    public double exibirExtrato() {
        return saldo;
    }
}
