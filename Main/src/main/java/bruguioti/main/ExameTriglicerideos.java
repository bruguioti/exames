/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bruguioti.main;

import javax.swing.JOptionPane;

public class ExameTriglicerideos extends Exame {
    private int quantidadeTriglicerideos;

    public ExameTriglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento, int quantidadeTriglicerideos) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    public int getQuantidadeTriglicerideos() {
        return quantidadeTriglicerideos;
    }

    public void setQuantidadeTriglicerideos(int quantidadeTriglicerideos) {
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public void classificarResultado() {
        String classificacao;

        if (quantidadeTriglicerideos < 75) {
            classificacao = "Dentro do limite";
        } else if (quantidadeTriglicerideos < 90) {
            classificacao = "Moderado";
        } else {
            classificacao = "Elevado";
        }

        JOptionPane.showMessageDialog(null, "Classificação de Triglicerídeos:\n" + classificacao);
    }

    @Override
    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "Resultado de Triglicerídeos:\nNome do Paciente: " + getNomePaciente() +
                "\nTipo Sanguíneo: " + getTipoSanguineo() +
                "\nAno de Nascimento: " + getAnoNascimento() +
                "\nQuantidade de Triglicerídeos: " + quantidadeTriglicerideos);
    }

    @Override
    public void cadastrarExame() {
        JOptionPane.showMessageDialog(null, "Exame de Triglicerídeos cadastrado:\nNome do Paciente: " + getNomePaciente() +
                "\nTipo Sanguíneo: " + getTipoSanguineo() +
                "\nAno de Nascimento: " + getAnoNascimento() +
                "\nQuantidade de Triglicerídeos: " + quantidadeTriglicerideos);
    }
}
