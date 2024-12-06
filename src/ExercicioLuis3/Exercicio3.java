package ExercicioLuis3;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        String palavra, repeticoes;

        try {
            palavra = JOptionPane.showInputDialog(null, "Entre com uma palavra:");

            if(palavra.isEmpty()){
                JOptionPane.showMessageDialog(null, "Nenhuma palavra insirada");
                System.exit(0);
            }
            repeticoes = Repetir(palavra);

            JOptionPane.showMessageDialog(null, repeticoes);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }

    static String Repetir(String palavra) {
        String resultado = "Frase ou palavra impressa 10 vezes:\n";
        for (int i = 1; i <= 10; i++) {
            resultado += i + " - " + palavra + "\n";
        }
        return resultado;
    }
}
