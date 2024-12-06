package ExercicioLuis1;

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[]args){

        String [] formal = {"Sr", "Sra"};
        String escolhaFormal = (String) JOptionPane.showInputDialog(null,
                "Entre com a maneira formal",
                "Formal",
                JOptionPane.QUESTION_MESSAGE,
                null,
                formal,
                formal[0]);

        String primeiroNome = JOptionPane.showInputDialog("Entre com o seu primeiro nome");
        String ultimoNome = JOptionPane.showInputDialog("Entre com o seu ultimo nome");

        byte idade = Byte.parseByte(JOptionPane.showInputDialog("Entre com a sua idade"));
        while (idade < 0){
            JOptionPane.showMessageDialog(null, "Idade invalida, tente novamente");
            idade = Byte.parseByte(JOptionPane.showInputDialog("Entre com a sua idade"));
        }

        String [] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
        String escolhaEstado = (String) JOptionPane.showInputDialog(null,
                "Escolha seu estado de origem",
                "Estado",
                JOptionPane.QUESTION_MESSAGE,
                null,
                estados,
                estados[0]);

        String rg = JOptionPane.showInputDialog("Entre com seu RG:");

        JOptionPane.showMessageDialog(null,
                escolhaFormal + " " +primeiroNome +" " + ultimoNome + "\n" + idade + " anos\n"+ "RG " + rg + "\nEstado de origem " + escolhaEstado);
    }
}
