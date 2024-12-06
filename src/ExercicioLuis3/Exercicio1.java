package ExercicioLuis3;

import javax.swing.*;

public class Exercicio1{
    public static void main(String[]args){
        int codigo, produto;
        float valor, valorAumento;

        try {
            produto = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Forneça o valor do produto:"));
            codigo = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Forneça o codigo de aumento:"));

            switch (codigo){
                case 1:
                    valor = 15.00f;
                    valorAumento = (float) (produto * (valor/100));
                    JOptionPane.showMessageDialog(null, "Valor com aumento: " + valorAumento);
                    break;
                case 3:
                    valor = 20.00f;
                    valorAumento = (float) (produto * (valor/100));
                    JOptionPane.showMessageDialog(null, "Valor com aumento: "+ valorAumento);
                    break;
                case 4:
                    valor = 35.00f;
                    valorAumento = (float) (produto * (valor/100));
                    JOptionPane.showMessageDialog(null, "Valor com aumento: "+ valorAumento);
                    break;
                case 8:
                    valor = 40.00f;
                    valorAumento = (float) (produto * (valor/100));
                    JOptionPane.showMessageDialog(null, "Valor com aumento: "+ valorAumento);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Codigo de aumento desconhecido");
                    break;
            }
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão,\n" +
                    "Digite apenas caracteres numericos");
            System.exit(0);
        }
    }
}