package Java.ProgramacaoOO.Casa.Exercicio03.models.Data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getDia() {
        return dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getMes() {
        return mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }

    public void escreverAData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }

    public void escreverOMes() {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        if (mes >= 1 && mes <= 12) {
            System.out.println("Mês: " + meses[mes - 1]);
        } else {
            System.out.println("Mês inválido.");
        }
    }

    private boolean anoBissexto(){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public void verificarAnoBissexto() {
        if (anoBissexto()) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }

    public void quantoFaltaFimDoAno() {
        int diasNoAno = 365;
        if (anoBissexto()) {
            diasNoAno = 366; // Ano bissexto
        }
        int diasPassados = (mes - 1) * 30 + dia; // Aproximação simples
        int diasRestantes = diasNoAno - diasPassados;
        System.out.println("Faltam " + diasRestantes + " dias para o fim do ano " + ano + ".");
    }
}
