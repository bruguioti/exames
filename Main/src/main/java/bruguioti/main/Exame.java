/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bruguioti.main;

import javax.swing.JOptionPane;

public class Exame {
    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public void classificarResultado() {
        JOptionPane.showMessageDialog(null, "Resultado do Exame:\nClassificação não disponível");
    }

    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "Resultado do Exame:\nNome do Paciente: " + nomePaciente +
                "\nTipo Sanguíneo: " + tipoSanguineo +
                "\nAno de Nascimento: " + anoNascimento);
    }

    public void cadastrarExame() {
        JOptionPane.showMessageDialog(null, "Exame cadastrado:\nNome do Paciente: " + nomePaciente +
                "\nTipo Sanguíneo: " + tipoSanguineo +
                "\nAno de Nascimento: " + anoNascimento);
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
