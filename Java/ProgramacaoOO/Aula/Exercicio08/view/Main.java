package Java.ProgramacaoOO.Aula.Exercicio08.view;

import Java.ProgramacaoOO.Aula.Exercicio08.model.Consulta;
import Java.ProgramacaoOO.Aula.Exercicio08.model.Especialidade;
import Java.ProgramacaoOO.Aula.Exercicio08.model.Medico;
import Java.ProgramacaoOO.Aula.Exercicio08.model.Paciente;

public class Main {
    public static void main(String[] args) {
        Consulta consulta = new Consulta();

        consulta.agendarConsulta(
            new Paciente("Afase Cabelão", "123123123-12", "12/09/2004"),
            new Medico("Gabis", "123", new Especialidade("Clínico Geral")), 
            "23/07/25", 
            "21h24"
        );

        System.out.println(consulta.mostrarAgendamento());
    }
}
