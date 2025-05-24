package br.com.fiap.main;

import br.com.fiap.beans.*;

import javax.swing.JOptionPane;

public class TesteSistema {
    public static void main(String[] args) {
        // Dados do paciente
        String nomePaciente = JOptionPane.showInputDialog("Nome do paciente:");
        String cpfPaciente = JOptionPane.showInputDialog("CPF do paciente:");
        String necessidade = JOptionPane.showInputDialog("Necessidade especial:");

        String rua = JOptionPane.showInputDialog("Endereço:");
        String cidade = JOptionPane.showInputDialog("Cidade:");
        String estado = JOptionPane.showInputDialog("Estado:");
        Endereco endereco = new Endereco(rua, cidade, estado);

        String telefone = JOptionPane.showInputDialog("Telefone:");
        String email = JOptionPane.showInputDialog("Email:");
        Contato contato = new Contato(telefone, email);

        Paciente paciente = new Paciente(nomePaciente, cpfPaciente, necessidade, endereco, contato);

        // Dados do profissional
        String nomeMedico = JOptionPane.showInputDialog("Nome do profissional:");
        String cpfMedico = JOptionPane.showInputDialog("CPF do profissional:");
        String registro = JOptionPane.showInputDialog("Registro (CRM):");
        String nomeEspecialidade = JOptionPane.showInputDialog("Especialidade:");
        Especialidade especialidade = new Especialidade(nomeEspecialidade);

        ProfissionalSaude medico = new ProfissionalSaude(nomeMedico, cpfMedico, registro, especialidade);

        // Dados da consulta
        String data = JOptionPane.showInputDialog("Data da consulta (dd/mm/aaaa):");
        String hora = JOptionPane.showInputDialog("Hora da consulta (hh:mm):");
        Horario horario = new Horario(data, hora);

        Consulta consulta = new Consulta(paciente, medico, horario);
        Agendamento agendamento = new Agendamento();
        agendamento.agendarConsulta(consulta);

        // Exibir resumo
        JOptionPane.showMessageDialog(null, "Resumo da Consulta:\n\n" + consulta.toString());
    }
}
