package br.com.fiap.beans;

public class Consulta {

    private Paciente paciente;
    private ProfissionalSaude profissional;
    private Horario horario;

    public Consulta() {}

    public Consulta(Paciente paciente, ProfissionalSaude profissional, Horario horario) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.horario = horario;
    }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public ProfissionalSaude getProfissional() { return profissional; }
    public void setProfissional(ProfissionalSaude profissional) {
        this.profissional = profissional;
    }

    public Horario getHorario() { return horario; }
    public void setHorario(Horario horario) { this.horario = horario; }

    @Override
    public String toString() {
        return "Consulta com " + profissional + " para " + paciente + " em " + horario;
    }
}
