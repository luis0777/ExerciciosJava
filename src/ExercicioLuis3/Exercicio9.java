package ExercicioLuis3;

import javax.swing.*;

public class Exercicio9 {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        int ladosDoDado;
        String aux="";


        for (int i = min; i <= max; i++) {
            ladosDoDado = (min + (int) (Math.random() * max));
            aux+= "Jogada: " + i +" ==> " + ladosDoDado + "\n";
        }
        JOptionPane.showMessageDialog(null, aux);
    }
}
