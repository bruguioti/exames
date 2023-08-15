/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bruguioti.main;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ExameColesterol exameColesterol = criarExameColesterol();
        ExameGlicemia exameGlicemia = criarExameGlicemia();
        ExameTriglicerideos exameTriglicerideos = criarExameTriglicerideos();

        exameColesterol.mostrarResultado();
        exameGlicemia.mostrarResultado();
        exameTriglicerideos.mostrarResultado();
    }

    public static ExameColesterol criarExameColesterol() {
        String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente:");
        String tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguíneo do paciente:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente:"));
        int quantidadeLDL = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de LDL em mg/dL:"));
        int quantidadeHDL = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de HDL em mg/dL:"));
        char risco = JOptionPane.showInputDialog("Digite o risco do paciente (B - baixo, M - médio, A - alto):").charAt(0);

        return new ExameColesterol(nomePaciente, tipoSanguineo, anoNascimento, quantidadeLDL, quantidadeHDL, risco);
    }

    public static ExameGlicemia criarExameGlicemia() {
        String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente:");
        String tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguíneo do paciente:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente:"));
        int quantidadeGlicose = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de glicose em mg/dL:"));

        return new ExameGlicemia(nomePaciente, tipoSanguineo, anoNascimento, quantidadeGlicose);
    }

    public static ExameTriglicerideos criarExameTriglicerideos() {
        String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente:");
        String tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguíneo do paciente:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente:"));
        int quantidadeTriglicerideos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de triglicerídeos em mg/dL:"));

        return new ExameTriglicerideos(nomePaciente, tipoSanguineo, anoNascimento, quantidadeTriglicerideos);
    }
}
