package ExercicioLuis2;

import javax.swing.*;

public class Exercicio8_1 {
    public static  void main(String [] args){
        String [] operacao = {"Cadastro", "Login", "SAIR"};
        String escolhaOperacao;
        String usuarioCad = null, usuarioLog;
        int senhaCad = 0, senhaLog;
        boolean sair = true;


        try {
            while (sair){
                escolhaOperacao = (String) JOptionPane.showInputDialog(null,
                        "Escolha uma das opções", "Bem vindo",JOptionPane.INFORMATION_MESSAGE, null, operacao, operacao[0]);

                switch (escolhaOperacao){
                    case "Cadastro":
                        usuarioCad = JOptionPane.showInputDialog(null,"Cadastre seu usuario","CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                        senhaCad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cadastre sua senha, apenas numeros","CADASTRO", JOptionPane.INFORMATION_MESSAGE));
                        JOptionPane.showMessageDialog(null, "Cadastro realizando com sucesso","Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Login":
                        usuarioLog = JOptionPane.showInputDialog(null,"Digite o usuario");
                        senhaLog = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha"));

                        while (!usuarioLog.equals(usuarioCad)  || senhaLog != senhaCad){
                            JOptionPane.showMessageDialog(null, "Informações incorretas, tente novamente", "ERRO", JOptionPane.ERROR_MESSAGE);

                            usuarioLog = JOptionPane.showInputDialog(null,"Digite o usuario");
                            senhaLog = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha"));
                        }
                        JOptionPane.showMessageDialog(null, "Login efetuado com sucesso", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "SAIR":
                        JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO");
                        sair = false;
                        System.exit(0);
                        break;
                }
            }
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão");
            System.exit(0);
        }
    }
}
