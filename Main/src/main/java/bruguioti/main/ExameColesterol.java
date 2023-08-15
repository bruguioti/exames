/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bruguioti.main;

import javax.swing.JOptionPane;

public class ExameColesterol extends Exame {
    private int quantidadeLDL;
    private int quantidadeHDL;
    private char risco;

    public ExameColesterol(String nomePaciente, String tipoSanguineo, int anoNascimento,
                           int quantidadeLDL, int quantidadeHDL, char risco) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
        this.risco = risco;
    }

    public int getQuantidadeLDL() {
        return quantidadeLDL;
    }

    public void setQuantidadeLDL(int quantidadeLDL) {
        this.quantidadeLDL = quantidadeLDL;
    }

    public int getQuantidadeHDL() {
        return quantidadeHDL;
    }

    public void setQuantidadeHDL(int quantidadeHDL) {
        this.quantidadeHDL = quantidadeHDL;
    }

    public char getRisco() {
        return risco;
    }

    public void setRisco(char risco) {
        this.risco = risco;
    }

    @Override
    public void classificarResultado() {
        String classificacaoHDL;
        String classificacaoLDL;

        switch (risco) {
            case 'B':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            case 'M':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            case 'A':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            default:
                classificacaoHDL = "Classificação desconhecida";
                classificacaoLDL = "Classificação desconhecida";
        }

        JOptionPane.showMessageDialog(null, "Classificação de Colesterol:\nHDL: " + classificacaoHDL + "\nLDL: " + classificacaoLDL);
    }

    @Override
    public void mostrarResultado() {
        String classificacaoHDL;
        String classificacaoLDL;

        switch (risco) {
            case 'B':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            case 'M':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            case 'A':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            default:
                classificacaoHDL = "Classificação desconhecida";
                classificacaoLDL = "Classificação desconhecida";
        }

        JOptionPane.showMessageDialog(null, "Resultado de Colesterol:\nHDL: " + classificacaoHDL + "\nLDL: " + classificacaoLDL);
    }

    @Override
    public void cadastrarExame() {
        String classificacaoHDL;
        String classificacaoLDL;

        switch (risco) {
            case 'B':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            case 'M':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            case 'A':
                classificacaoHDL = (quantidadeHDL >= 40) ? "HDL - Bom" : "HDL - Baixo";
                classificacaoLDL = (quantidadeLDL < 100) ? "LDL - Ótimo" :
                        (quantidadeLDL < 130) ? "LDL - Normal" :
                        (quantidadeLDL < 160) ? "LDL - Quase alto" :
                        (quantidadeLDL < 190) ? "LDL - Alto" : "LDL - Muito alto";
                break;

            default:
                classificacaoHDL = "Classificação desconhecida";
                classificacaoLDL = "Classificação desconhecida";
        }

        JOptionPane.showMessageDialog(null, "Exame de Colesterol cadastrado:\nNome do Paciente: " + getNomePaciente()
                + "\nTipo Sanguíneo: " + getTipoSanguineo() + "\nAno de Nascimento: " + getAnoNascimento()
                + "\nHDL: " + classificacaoHDL + "\nLDL: " + classificacaoLDL);
    }
}
