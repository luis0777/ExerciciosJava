package ExercicioLuis2;

import javax.swing.*;

public class Exercicio7 {
    public static void main(String[] args){
        byte num;
        String descricao = "Dia da semana: ";

        try {
            num = Byte.parseByte(JOptionPane.showInputDialog(null,"Forneça um numero de 1 a 7"));

            switch (num){
                case 1:
                    JOptionPane.showMessageDialog(null, descricao + "Domingo");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, descricao + "Segunda");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, descricao + "Terça");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, descricao + "Quarta");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, descricao + "Quinta");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, descricao + "Sexta");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, descricao + "Sabado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, descricao + "Dia da semana desconhecido");
                    break;
            }
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null,
                    "Erro na conversão,\n" + "Digite apenas caracteres numericos");
            System.exit(0);
        }
    }
}
