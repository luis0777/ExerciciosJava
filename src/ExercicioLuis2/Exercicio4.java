package ExercicioLuis2;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String []args){
        float comprimento, largura, pronfudidade, metrosCubicos, valor, total;
        valor = 45.00F;
        String unir ="";

        try {
            comprimento = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Comprimento da piscina","CONSTRUÇÕES", JOptionPane.QUESTION_MESSAGE));
            largura = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Largura da piscina","CONSTRUÇÕES", JOptionPane.QUESTION_MESSAGE));
            pronfudidade = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Profundidade da piscina","CONSTRUÇÕES", JOptionPane.QUESTION_MESSAGE));

            metrosCubicos = comprimento * largura * pronfudidade;
            total = metrosCubicos * valor;
            unir = "A piscina solicitada terá " + metrosCubicos + " metros cúbicos\n" +
                    "O valor da construção será de: R$ " + total;

            JOptionPane.showMessageDialog(null,unir,"CONSTRUÇÕES",JOptionPane.INFORMATION_MESSAGE);

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão,\n" +
                    "Digite apenas caracteres numericos");
            System.exit(0);
        }
    }
}