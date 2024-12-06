package ExercicioLuis4;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[]args){
        String fraseFornecida, fraseSemVogal = "";

        try {
            fraseFornecida = JOptionPane.showInputDialog(null,"Forneça a frase");

            if(fraseFornecida.isEmpty()){
                JOptionPane.showMessageDialog(null,"Nenhuma frase insirada");
                System.exit(0);
            }

            for (int i = fraseFornecida.length() - 1; i >= 0; i--) {
                if (fraseFornecida.charAt(i) !=  'a' &&
                    fraseFornecida.charAt(i) !=  'e' &&
                    fraseFornecida.charAt(i) !=  'i' &&
                    fraseFornecida.charAt(i) !=  'o' &&
                    fraseFornecida.charAt(i) !=  'u'){
                        fraseSemVogal += fraseFornecida.charAt(i);
                }
            }

            JOptionPane.showMessageDialog(null,"Frase fornecida " + fraseFornecida +
                    "\nFrase sem vogais " + fraseSemVogal);


        }catch (Exception e){

        }
    }
}
