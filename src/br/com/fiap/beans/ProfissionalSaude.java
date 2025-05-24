package br.com.fiap.beans;

public class ProfissionalSaude extends Pessoa {

    private String registro;
    private Especialidade especialidade;

    public ProfissionalSaude() {}

    public ProfissionalSaude(String nome, String cpf, String registro, Especialidade especialidade) {
        super(nome, cpf);
        this.registro = registro;
        this.especialidade = especialidade;
    }

    public String getRegistro() { return registro; }
    public void setRegistro(String registro) { this.registro = registro; }

    public Especialidade getEspecialidade() { return especialidade; }
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Registro: " + registro + ", " + especialidade;
    }
}
