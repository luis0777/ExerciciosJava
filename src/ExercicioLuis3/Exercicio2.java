package ExercicioLuis3;

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[]args){
        float n1, n2, n3;

        int continuar;
        do {
            try {
                n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "1º numero"));
                n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "2º numero"));
                n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "3º numero"));

                float resultado = Maior(n1, n2, n3);

                JOptionPane.showMessageDialog(null, "Numeros fornecidos:" +
                        "\n" + n1 +
                        "\n" + n2 +
                        "\n" + n3 +
                        "\n\n Maior numero: " + resultado);

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Erro na conversão,\n" +
                        "Digite apenas caracteres numericos");
                System.exit(0);
            }
            continuar =  JOptionPane.showConfirmDialog(null, "Deseja repetir");
        }while (continuar == JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "Programa Encerrado", "Fim", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    static float Maior(float n1, float n2, float n3){
        float maiorNum = n1;

        if(n2 > maiorNum){
            maiorNum = n2;
        }
        if (n3 > maiorNum){
            maiorNum = n3;
        }
        return maiorNum;
    }
}
