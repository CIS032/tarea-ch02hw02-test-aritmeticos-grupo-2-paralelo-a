package preguntas_aritmeticas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import preguntas_aritmetica.Banco_de_Preguntas;
import preguntas_aritmetica.Preguntas_Concretadas;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Preguntas_Concretadas> preguntas = new ArrayList<>();
        while (true) {
            String menu = "1 -->Rendir Examen\n"
                    + "2 -->Administrar Examen\n"
                    + "3 --> Calificar Examen\n"
                    + "4 -->Salir\n";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    Utilidades.resolución(preguntas);
                    break;
                case 2:
                    Banco_de_Preguntas.getPregunatas(preguntas);
                    break;
                case 3:
                    Banco_de_Preguntas.revision(preguntas);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

}
