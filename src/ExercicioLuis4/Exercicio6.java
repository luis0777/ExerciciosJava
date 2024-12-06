package ExercicioLuis4;

import javax.swing.*;

public class Exercicio6 {
    public static void main(String[]args){
        String email = "luis", senha = "1234", emailFornecido, senhaFornecida;

        emailFornecido = JOptionPane.showInputDialog(null,"Forneça o e½");
        senhaFornecida = JOptionPane.showInputDialog(null,"Forneça Senha");

        while (!emailFornecido.equals(email) || !senhaFornecida.equals(senha)){
            for(int tentativas = 2; tentativas >= 1; tentativas--){
                JOptionPane.showMessageDialog(null,
                        "E½ ou senha incorretos\n\n"+
                        "Você tem: " + tentativas + " tentativa(s)");
                emailFornecido = JOptionPane.showInputDialog(null,"Forneça o e½");
                senhaFornecida = JOptionPane.showInputDialog(null,"Forneça Senha");

                if (emailFornecido.equals(email) && senhaFornecida.equals(senha)) {
                    JOptionPane.showMessageDialog(null, "Sistema liberado");
                    System.exit(0);
                }
            }
            JOptionPane.showMessageDialog(null,"Sistema Bloqueado");
            System.exit(0);
        }
    }
}

