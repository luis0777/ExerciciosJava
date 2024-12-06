package ExercicioLuis4;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[]args){
        int numFornecido;
        boolean continuar = true;

        while (continuar){
            try {
                numFornecido = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite um numero de 0 a 10"));

                if(numFornecido < 0 || numFornecido > 10){
                    JOptionPane.showMessageDialog(null,"Digite um numero entre 0 e  10");
                }else{
                    Sortear(numFornecido);
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Digite um numero");
            }
        }
    }
    static int Sortear(int numero){
        String aux = "";
        boolean acertou = false;

        for (int cont = 0; cont <= 10; cont++) {
            int num = (int) (Math.random() * 11);// Gera Numeros 0-10
            aux = aux + num + " ";// Saída dos valores

            if (num == numero){
                acertou = true;
            }
        }

        if(acertou){
            JOptionPane.showMessageDialog(null,
                    "O Numero digitado foi: " + numero+
                            "\n\nNumeros sorteados: \n" + aux +
                            "\n\nVocê acertou o numero");
        }else {
            JOptionPane.showMessageDialog(null,
                    "O Numero digitado foi: " + numero+
                            "\n\nNumeros sorteados: \n" + aux +
                            "\n\nVocê não acertou o numero");
        }
        return 0;
    }
}

