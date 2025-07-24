package Java.ProgramacaoOO.Aula.Exercicio08.model;

public class Consulta {
    private String data;
    private String hora;
    private Paciente paciente;
    private Medico medico;

    public Consulta(){
        System.out.println("Consulta em agendamento.");
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void agendarConsulta(Paciente paciente, Medico medico, String data, String hora){
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
    }

    public String mostrarAgendamento(){
        return "Paciente " + this.paciente.getNome() + " está com agendamento para o medico " + this.medico.getNome() + " no dia " + this.data + " ás " + this.hora + ".";
    }
}
