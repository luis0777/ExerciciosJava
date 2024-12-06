package ExercicioLuis2;

import javax.swing.*;

public class ExemploArrayObtendoDados {
    public static  void main(String [] args){
        String nomes;
        int quantNomes;

        nomes = JOptionPane.showInputDialog(null,
                "Informe a quantidade de nomes a\nserem inseridos no array");
        quantNomes = Integer.parseInt(nomes);

        String[] nomesArray = new String[quantNomes];

        for (int i = 0; i < quantNomes; i++) {
            nomesArray[i] = JOptionPane.showInputDialog(null, "Informe o nome do " + (i + 1) + "°");
        }

        StringBuilder todosOsNomes = new StringBuilder("Nomes inseridos:\n");
        for (int i = 0; i < nomesArray.length; i++) {
            todosOsNomes.append("Índice ").append(i).append(" - Nome: ").append(nomesArray[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, todosOsNomes.toString());
    }
}
