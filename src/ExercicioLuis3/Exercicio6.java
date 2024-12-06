package ExercicioLuis3;

import javax.swing.*;

public class Exercicio6 {
    public static void main(String[]args){
        String [] num = {"1","2","3","4","5","6","7","8","9","10"};
        int continuar;
        String tabuada, escolhaNum;

        do {
            escolhaNum = (String) JOptionPane.showInputDialog(null,
                    "Escolha o numero da tabuada",
                    "TABUADA",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    num,
                    num[0]);

            tabuada = tabuadaFeita(Integer.parseInt(escolhaNum));

            JOptionPane.showMessageDialog(null, tabuada);

            continuar =  JOptionPane.showConfirmDialog(null, "Deseja repetir");
        }while (continuar == JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "Programa Encerrado", "Fim", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    static String tabuadaFeita(int num){
        String resposta = "Tabuada do " + num;
        for(int i = 1; i <= 10; i++){
            resposta += "\n" + num + " X " + i + " = " + (num * i);
        }
        return resposta;
    }
}
