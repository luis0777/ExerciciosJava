package ExercicioLuis3;

import javax.swing.*;

public class Exercicio10 {
    public static  void main(String[]args){
        float lado, potencia = 3;
        String volume;

        try {
            lado = Float.parseFloat(JOptionPane.showInputDialog(null,"Forneça o valor do lado"));
            volume = VolumeCalculado(lado);
            JOptionPane.showMessageDialog(null, volume);

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão\n" +
                    "Digite apenas caracteres numericos");
            System.exit(0);
        }
    }
    static String VolumeCalculado(float lado){
        String resposta = "Valor do lado: " + lado + "\nVolume calculado = " + Math.pow(lado, 3) + " metros cúbicos";
        return resposta;
    }
}


