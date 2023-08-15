/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bruguioti.main;

import javax.swing.JOptionPane;

public class ExameGlicemia extends Exame {
    private int quantidadeGlicose;

    public ExameGlicemia(String nomePaciente, String tipoSanguineo, int anoNascimento, int quantidadeGlicose) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeGlicose = quantidadeGlicose;
    }

    public int getQuantidadeGlicose() {
        return quantidadeGlicose;
    }

    public void setQuantidadeGlicose(int quantidadeGlicose) {
        this.quantidadeGlicose = quantidadeGlicose;
    }

    @Override
    public void classificarResultado() {
        String classificacao;

        if (quantidadeGlicose < 70) {
            classificacao = "Hipoglicemia";
        } else if (quantidadeGlicose < 100) {
            classificacao = "Normal";
        } else if (quantidadeGlicose < 126) {
            classificacao = "Glicemia de Jejum Alterada";
        } else {
            classificacao = "Diabetes";
        }

        JOptionPane.showMessageDialog(null, "Classificação de Glicemia:\n" + classificacao);
    }

    @Override
    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "Resultado de Glicemia:\nNome do Paciente: " + getNomePaciente() +
                "\nTipo Sanguíneo: " + getTipoSanguineo() +
                "\nAno de Nascimento: " + getAnoNascimento() +
                "\nQuantidade de Glicose: " + quantidadeGlicose);
    }

    @Override
    public void cadastrarExame() {
        JOptionPane.showMessageDialog(null, "Exame de Glicemia cadastrado:\nNome do Paciente: " + getNomePaciente() +
                "\nTipo Sanguíneo: " + getTipoSanguineo() +
                "\nAno de Nascimento: " + getAnoNascimento() +
                "\nQuantidade de Glicose: " + quantidadeGlicose);
    }
}
