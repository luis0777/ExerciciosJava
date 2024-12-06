package ExercicioLuis4;

import javax.swing.*;

class Exercicio6_1 {
    public static void main(String[]args){
        boolean sair = true;
        String [] opcao = {"Cadastro","Login","Sair"};
        String opcaoEscolhida, emailCad = "", senhaCad = "", emailLogin, senhaLogin;

        while (sair){
            try {
                opcaoEscolhida = (String) JOptionPane.showInputDialog(null,
                        "Escolha uma das opções",
                        "CADASTRO",
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opcao,
                        opcao[0]);

                switch (opcaoEscolhida){
                    case "Cadastro":
                        emailCad = JOptionPane.showInputDialog(null,"Insira o email");
                        while (emailCad.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Campo email vazio");
                            emailCad = JOptionPane.showInputDialog(null,"Insira o email");
                        }
                        senhaCad = JOptionPane.showInputDialog(null,"Insira a senha");
                        while (senhaCad.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Campo senha vazio");
                            senhaCad = JOptionPane.showInputDialog(null,"Insira a senha");
                        }
                        JOptionPane.showMessageDialog(null,"Cadastro realizando com sucesso");
                        break;
                    case "Login":
                        emailLogin = JOptionPane.showInputDialog(null,"Insira o email");
                        senhaLogin = JOptionPane.showInputDialog(null,"Insira a senha");

                        while (!emailLogin.equals(emailCad) || !senhaLogin.equals(senhaCad)){
                            for(int i = 2; i >= 1; i--){
                                JOptionPane.showMessageDialog(null,
                                        "Email ou senha incorretos\n" +
                                                "Você tem: " +  i + " tentativa(s)");
                                emailLogin = JOptionPane.showInputDialog(null,"Insira o email");
                                senhaLogin = JOptionPane.showInputDialog(null,"Insira a senha");

                                if (emailLogin.equals(emailCad) && senhaLogin.equals(senhaCad)) {
                                    JOptionPane.showMessageDialog(null, "Sistema liberado");
                                    System.exit(0); // Finaliza o programa
                                }
                            }
                            JOptionPane.showMessageDialog(null,"Sistema Bloqueado");
                            System.exit(0);
                        }

                        break;
                    case "Sair":
                        JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO");
                        System.exit(0);
                        break;
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Erro inesperado");

            }
        }
    }
}
