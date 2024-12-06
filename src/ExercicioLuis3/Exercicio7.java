package ExercicioLuis3;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio7 {
    public static void main(String[]args){
        String valor1, valor2, fornecidos, convertidos, soma;


        try {
            valor1 = String.valueOf(Float.parseFloat(JOptionPane.showInputDialog(null, "Primeiro valor")));
            valor2 = String.valueOf(Float.parseFloat(JOptionPane.showInputDialog(null, "Segundo valor")));

            fornecidos = "Valores fornecidos: " + valor1 + " e " + valor2;
            convertidos = "Valores convertidos: R$" + valor1.replace(".", ",") + " e R$" + valor2.replace(".", ",");

            soma = "Soma: R$ " + (valor1 + valor2);

            JOptionPane.showMessageDialog(null, fornecidos + "\n" + convertidos+ "\n" + soma);

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão\n" +
                    "Digite apenas caracteres numericos");
            System.exit(0);
        }
    }
}
