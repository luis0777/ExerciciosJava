package ExercicioLuis2;

import javax.swing.*;

public class Exercicio6 {

    public static  void main(String [] args) {
        int continuar;
        float peso, altura, Imc;
        String situacao ="";

        do {
            JOptionPane.showMessageDialog(null,
                    "O indice de massa corporal\nFormula: (Peso + Altura²)/2",
                    "Calculadora de IMC", JOptionPane.INFORMATION_MESSAGE);

            try {
                peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Peso\n(use ponto em vez de virgula)"));
                    while (peso < 0) {
                        JOptionPane.showMessageDialog(null,
                                "Peso invalido, tente novamente...", "Erro", JOptionPane.QUESTION_MESSAGE);
                        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Peso\n(use ponto em vez de virgula)"));
                    }

                altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Altura\n(use ponto em vez de virgula)"));
                    while (altura < 0) {
                        JOptionPane.showMessageDialog(null,
                                "Altura invalida, tente novamente...", "Erro", JOptionPane.QUESTION_MESSAGE);
                        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Altura\n(use ponto em vez de virgula)"));
                    }

                Imc = IMC(peso, altura);
                situacao = Situacao(Imc);

                JOptionPane.showMessageDialog(null, "De acordo com o seu peso " + peso + " e altura " + altura +
                        "\nIMC: " + Imc + "\nSituação: " + situacao);

                }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Erro ,\n" +
                        "Insira os dados corretamente");
                System.exit(0);
            }
            continuar = JOptionPane.showConfirmDialog(null,"Deseja realizar outro calculo");

            }while (continuar == JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "Programa Encerrado", "Fim", JOptionPane.INFORMATION_MESSAGE);
    }

    static float IMC(float peso, float altura){
        float resultadoIMC = (peso + altura * altura)/2;
        return resultadoIMC;
    }

    static  String Situacao(float imc){
        String resultado;
        if(imc < 16){
            resultado = "Baixo Peso(grau I)";
            return resultado;
        } else if (imc < 16.99) {
            resultado = "Baixo Peso(grau II)";
            return resultado;
        } else if (imc < 18.49) {
            resultado = "Baixo do Peso(grau III)";
            return resultado;
        } else if (imc < 24.99) {
            resultado = "Peso Adequado";
            return resultado;
        } else if (imc < 29.99) {
            resultado = "Sobrepeso";
            return  resultado;
        } else if (imc < 34.99) {
            resultado = "Obesidade(grau I)";
            return resultado;
        } else if (imc < 39.99) {
            resultado = "Obesidade(grau II)";
            return resultado;
        }else{
            resultado = "Obesidade(grau III)";
            return resultado;
        }
    }
}
