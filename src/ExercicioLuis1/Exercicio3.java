package ExercicioLuis1;

import javax.swing.*;

public class Exercicio3{
    public static void main(String[] args){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Primeiro numero"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Segundo numero"));

        float soma = Soma(n1, n2);
        float subtracao = Subtracao(n1, n2);
        float multiplicacao = Multiplicacao(n1, n2);
        float divisao = Divisao(n1, n2);

        JOptionPane.showMessageDialog(null, "Numeros fornecidos " + n1 + " e " + n2+
                "\nSoma = " + soma+
                "\nSubtração = " + subtracao +
                "\nMultiplicação = " + multiplicacao +
                "\nDivisão = " + divisao);
    }
    static  float Soma(float n1, float n2){
        float resultadoSoma = n1 + n2;
        return resultadoSoma;
    }
    static float Subtracao(float n1, float n2){
        float resultadoSubtracao = n1 - n2;
        return  resultadoSubtracao;
    }
    static  float Multiplicacao(float n1, float n2){
        float resultadoMultiplicacao = n1 * n2;
        return  resultadoMultiplicacao;
    }
    static  float Divisao(float n1, float n2){
        float resultadoDivisao = n1 / n2;
        return resultadoDivisao;
    }
}