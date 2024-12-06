package ExercicioLuis2;

import javax.swing.*;

public class Exercicio3 {
    public static  void main(String[] args){
        float areaTotal, largura, comprimento;
        String unir ="";

        try {
            largura = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Entre com a largura do lote","Lote", JOptionPane.INFORMATION_MESSAGE));

            comprimento = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Entre com a comprimento do lote","Lote", JOptionPane.INFORMATION_MESSAGE));

            areaTotal = largura *comprimento;
            unir = "Área Total = " + areaTotal + " metros quadrados";

            JOptionPane.showMessageDialog(null, unir, "Lote", JOptionPane.INFORMATION_MESSAGE);

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão,\n" +
                    "Digite apenas caracteres numericos");
            System.exit(0);
        }
    }
}
