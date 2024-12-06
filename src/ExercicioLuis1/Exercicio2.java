package ExercicioLuis1;

import javax.swing.*;

public class Exercicio2{
    public static void main(String [] args){

        float valorBase = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da base do triangulo"));
        while (valorBase < 0){
            JOptionPane.showMessageDialog(null, "Valor da base invalido, tente novamente");
            valorBase = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da base do triangulo"));
        }

        float valorAltura = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da altura do triangulo"));
        while (valorAltura < 0){
            JOptionPane.showMessageDialog(null, "Valor da altura invalida, tente novamente");
            valorAltura = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da altura do triangulo"));
        }

        float area =CalcularArea(valorBase, valorAltura);

        JOptionPane.showMessageDialog(null,"Triangulo\nBase: " + valorBase + "\nAltura: " + valorAltura +
                "\nArea: " + area);
    }

    static float CalcularArea(float base, float altura){
        float area = (base * altura)/2;
        return area;
    }
}
