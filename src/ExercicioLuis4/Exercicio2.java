package ExercicioLuis4;

import javax.swing.*;

public class Exercicio2 {
    public static  void main(String[]args){
        String frase, fraseInvertida = "";

        try {
            frase = JOptionPane.showInputDialog(null,"Forneça a frase");

            if(frase.isEmpty()){
                JOptionPane.showMessageDialog(null,"Nenhuma frase insirada");
                System.exit(0);
            }
            for (int i = frase.length() - 1; i >= 0; i--) {
                fraseInvertida += frase.charAt(i);
            }
            JOptionPane.showMessageDialog(null,"Frase invertida: " + fraseInvertida);

        }catch (Exception e){

        }
    }
}
