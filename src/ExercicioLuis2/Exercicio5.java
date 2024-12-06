package ExercicioLuis2;

import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args){
        byte idade;

        try {
            idade = Byte.parseByte(JOptionPane.showInputDialog(null,"Digite sua idade"));

            while(idade < 0){
                JOptionPane.showMessageDialog(null,
                        "Idade invalida, tente novamente", "ERRO",JOptionPane.ERROR_MESSAGE);
                idade = Byte.parseByte(JOptionPane.showInputDialog(null,"Digite sua idade"));
            }

            if(idade >= 18){
                JOptionPane.showMessageDialog(null,
                        "Você tem " + idade + " anos\n" + "Maior de idade", "",JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null,
                        "Você tem " + idade + " anos\n" + "Menor de idade", "",JOptionPane.INFORMATION_MESSAGE);
            }

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão,\n" +
                    "Digite apenas caracteres numericos");
            System.exit(0);
        }
    }
}
