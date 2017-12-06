/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas_aritmetica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Banco_de_Preguntas {

    public static boolean verificarUsuario(ArrayList<Preguntas_Concretadas> preguntas, String cedula) {
        boolean respueta = false;

        for (Preguntas_Concretadas elemento : preguntas) {
            if (elemento.getCedula().equals(cedula)) {
                respueta = true;
            }
        }
        return respueta;
    }

    public static void getPregunatas(ArrayList<Preguntas_Concretadas> preguntas) {
        String cedula = JOptionPane.showInputDialog(null, "Ïngrese su numero de cedula para coontinuar con el exámen");
        boolean ingresar = verificarUsuario(preguntas, cedula);
        String aux = " ";
        if (ingresar) {
            for (Preguntas_Concretadas elementos : preguntas) {
                if (elementos.getCedula().equals(cedula)) {
                    aux = aux + elementos.toString() + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, "Resultado del Exámen: " + cedula + "\n" + aux, "Test Arimética", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario Inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void revision(ArrayList<Preguntas_Concretadas> pregunta) {
        int nota = 0;
        String cedula = JOptionPane.showInputDialog(null, "Ingrese su número de cédula", "Clificacion", JOptionPane.INFORMATION_MESSAGE);
        boolean ingresar = verificarUsuario(pregunta, cedula);
        if (ingresar) {
            for (Preguntas_Concretadas elementos : pregunta) {
                if (elementos.getCedula().equals(cedula) && elementos.isContestada() == true) {
                    nota++;
                }
            }
            JOptionPane.showMessageDialog(null, "Usuario: " + cedula + "\n nota = " + nota);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario inexistente", "Nota", JOptionPane.ERROR_MESSAGE);
        }
    }
}
