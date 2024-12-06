package ExercicioLuis2;

import javax.swing.*;

public class Exercicio2 {
    public static  void main(String[]args){

        int quant1, quant2, quant3;
        float valor1, valor2, valor3, total;

        try {
            quant1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade 1"));
            valor1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor 1"));
            quant2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade 2"));
            valor2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor 2"));
            quant3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade 3"));
            valor3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor 3"));

            total = (quant1 * valor1) + (quant2 * valor2) + (quant3 * valor3);

            JOptionPane.showMessageDialog(null,"Resultado é " + total);

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão,\n" +
                    "Digite apenas caracteres numericos");
            System.exit(0);
        }

    }
}
