package ExercicioLuis4;

import javax.swing.*;



//não consegui fazer


public class Exercicio5 {
    public static void main(String[]args){
        boolean continuar = true;
        String aux = "", nomes = "";

        while (continuar){
            try {
                for(int i = 1; i < 6; i++){
                    aux = JOptionPane.showInputDialog(null,
                            "Forneça o nome da pessoa " + i);
                    if(aux.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Nenhum nome fornecido");
                        System.exit(0);
                    }
                    nomes = nomes + i +"º Nome: " + aux+"\n";

                }
                JOptionPane.showMessageDialog(null,
                        "Nomes digitados:\n" + nomes +
                        "O Ganhador foi o: ");

            }catch (Exception e){

            }
        }
    }
}
