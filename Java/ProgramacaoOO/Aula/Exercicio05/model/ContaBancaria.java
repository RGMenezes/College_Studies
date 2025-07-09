package Java.ProgramacaoOO.Aula.Exercicio05.model;

public class ContaBancaria {
    private String _titular;
    private String _numeroConta;
    private double _saldo;
    
    public ContaBancaria(String titular, String numeroConta) {
        this._titular = titular;
        this._numeroConta = numeroConta;
        this._saldo = 0.0;
    }
    
    public double getSaldo() {
        return _saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor de depósito deve ser positivo."); 
        this._saldo += valor;
    }

    public void sacar(double valor) {
        if (this._saldo < valor) throw new IllegalArgumentException("Saldo insuficiente para saque.");
        this._saldo -= valor;
    }

    public String exibirInfo() {
        return String.format("Titular: %s\nNúmero da Conta: %s\nSaldo: %.2f", this._titular, this._numeroConta, this._saldo);
    }
}