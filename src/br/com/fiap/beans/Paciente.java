package br.com.fiap.beans;

public class Paciente extends Pessoa {
    private String necessidadeEspecial;
    private Endereco endereco;
    private Contato contato;

    public Paciente() {}

    public Paciente(String nome, String cpf, String necessidadeEspecial, Endereco endereco, Contato contato) {
        super(nome, cpf);
        this.necessidadeEspecial = necessidadeEspecial;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNecessidadeEspecial() { return necessidadeEspecial; }
    public void setNecessidadeEspecial(String necessidadeEspecial) {
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public Contato getContato() { return contato; }
    public void setContato(Contato contato) { this.contato = contato; }

    @Override
    public String toString() {
        return super.toString() +
                "\nNecessidade Especial: " + necessidadeEspecial +
                "\nEndereço: " + endereco +
                "\nContato: " + contato;
    }
}

