package ExercicioLuis4;

import javax.swing.*;

public class Exercicio7 {
    public static void main(String[]args){
        boolean continuar = true;
        int valorInicial, valorFinal;

        while (continuar){
            try {
                valorInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor Inicial"));
                while (valorInicial < 1 || valorInicial > 40){
                    JOptionPane.showMessageDialog(null,"Valores devem estar na faixa entre 1 a 40");
                    valorInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor Inicial"));
                }

                valorFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor Final"));
                while (valorFinal < 1 || valorFinal > 40){
                    JOptionPane.showMessageDialog(null,"Valores devem estar na faixa entre 1 a 40");
                    valorFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor Final"));
                }

                if (valorInicial < valorFinal){
                    ContagemCrescente(valorInicial, valorFinal);
                } else if (valorInicial > valorFinal) {
                    ContagemDecrescente(valorInicial, valorFinal);

                }else {
                    JOptionPane.showMessageDialog(null,"Os dois valores são iguais");
                }


            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Digite valores númericos");
            }
        }
    }
    static void ContagemCrescente(int n1, int n2) {
        String aux = "";
        for (int i = n1; i <= n2; i++) {
            aux = aux + i + "\n";
        }
        String resposta = "Contagem Crescente entre (" + n1 + " - " + n2 + ")\n" + aux;
        JOptionPane.showMessageDialog(null, resposta); // Mostra a mensagem na contagem
    }

    static void ContagemDecrescente(int n2, int n1) {
        String aux = "";
        for (int i = n2; i >= n1; i--) {
            aux = aux + i + "\n";
        }
        String resposta = "Contagem Decrescente entre (" + n2 + " - " + n1 + ")\n" + aux;
        JOptionPane.showMessageDialog(null, resposta); // Mostra a mensagem na contagem

    }
}
