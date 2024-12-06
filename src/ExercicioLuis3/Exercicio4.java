package ExercicioLuis3;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[]args){
        int numero;
        String contados;

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Entre com o valor da contagem "));

            contados = Contagem(numero);

            JOptionPane.showMessageDialog(null, contados);

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão,\n" +
                    "Digite apenas caracteres numericos");
            System.exit(0);
        }
    }
    static String Contagem(int n) {
        String resposta = "Contagem até: " + n + "\n";
        for (int i = 1; i <= n; i++) {
            resposta += i + " ";
        }
        return  resposta;
    }
}
