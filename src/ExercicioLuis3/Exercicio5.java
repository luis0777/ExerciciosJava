package ExercicioLuis3;

import javax.swing.*;

public class Exercicio5 {
    public static void main(String[]args){
        String nome, sobrenome, repetições;

        try {
            nome = JOptionPane.showInputDialog(null, "Entre com o nome");
            sobrenome = JOptionPane.showInputDialog(null, "Entre com o sobrenome");

            if(nome.isEmpty() || sobrenome.isEmpty()){
                JOptionPane.showMessageDialog(null, "Campo em branco");
                System.exit(0);
            }

            repetições = Repetir(nome, sobrenome);

            JOptionPane.showMessageDialog(null, repetições);

        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
            System.exit(0);
        }
    }

    static  String Repetir(String nome, String sobrenome){
        String resposta = "";
        for(int i = 1; i <= 10; i++){
            resposta += "\n"+i + " - Nome " + nome +
                    "\nSobrenome " + sobrenome;
        }
        return resposta;
    }
}
