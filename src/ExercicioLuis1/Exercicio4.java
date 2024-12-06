package ExercicioLuis1;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[]args){
        float saldo = 0, deposito, saque;

        deposito = Float.parseFloat(JOptionPane.showInputDialog(null,"Entre com o valor do deposito: "));
        saldo = saldo + deposito;
        JOptionPane.showMessageDialog(null,"Seu saldo atual é R$ " + saldo);
        saque = Float.parseFloat(JOptionPane.showInputDialog(null,"Entre com o valor da retirada: "));
        saldo = saldo - saque;
        JOptionPane.showMessageDialog(null,"Seu saldo atual é R$ " + saldo);
    }
}
