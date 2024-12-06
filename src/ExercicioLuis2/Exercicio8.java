package ExercicioLuis2;

import javax.swing.*;

public class Exercicio8 {
    public static void main(String[]args){
        String usuario;
        int senha;

        try {
            usuario = JOptionPane.showInputDialog(null,"Digite o usuario");
            senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha"));

            while (usuario != "Luis" && senha != 1234){
                JOptionPane.showMessageDialog(null, "Usuario e senha incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
                usuario = JOptionPane.showInputDialog(null,"Digite o usuario");
                senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha"));
            }
            JOptionPane.showMessageDialog(null, "Usuario e senha corretos", "Sucesso", JOptionPane.INFORMATION_MESSAGE);


        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente");
            System.exit(0);
        }
    }
}
