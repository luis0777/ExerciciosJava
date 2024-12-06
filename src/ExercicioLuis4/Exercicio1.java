package ExercicioLuis4;

import javax.swing.*;

public class Exercicio1 {
    public static  void main(String[]args) {
        String frase, aux = "";

        JOptionPane.showMessageDialog(null, "Digite uma palavra, não deixe em branco!");
        frase = JOptionPane.showInputDialog(null, "Forneça a frase");

        for (int i = 1; i <= frase.length(); i++) {
            aux += frase.substring(0, i) + "\n";
        }

        for (int i = frase.length() - 1; i > 0; i--) {
            aux += frase.substring(0, i) + "\n";
        }

        JOptionPane.showMessageDialog(null, "Palavra fornecida: " + frase.toUpperCase() +
                "\nEfeito desejado:\n" + aux);
    }
}
