/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas_aritmeticas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import preguntas_aritmetica.División;
import preguntas_aritmetica.Multiplicación;
import preguntas_aritmetica.Preguntas_Concretadas;
import preguntas_aritmetica.Resta;
import preguntas_aritmetica.Suma;

/**
 *
 * @author Usuario
 */
public class Utilidades {

    ArrayList<Preguntas_Concretadas> preguntas = new ArrayList<>();

    public static String[] obtenerOpciones(int respuesta) {

        String arregloOpciones[] = new String[4];
        int posResp = (int) (Math.random() * 4);
        for (int i = 0; i < arregloOpciones.length; i++) {
            if (i == posResp) {
                arregloOpciones[i] = String.valueOf(respuesta);
            } else {
                int opciones = (int) (Math.random() * 50 + 1);
                arregloOpciones[i] = String.valueOf(opciones);
            }
        }
        return arregloOpciones;
    }
///resolucion de la pruba este metodo verifica el usuario y genera las distintas preguntas para que el usuario
    //resuelva la prueba

    public static void resolución(ArrayList<Preguntas_Concretadas> preguntas) {
        boolean cerrar = true;
        String cedula = "";
        while (cerrar) {
            cedula = JOptionPane.showInputDialog(null, "Ingrese cedula para rendir el examen", "UNL", JOptionPane.QUESTION_MESSAGE);
            if (cedula.length() < 10) {
                JOptionPane.showMessageDialog(null, "Cedula Incorrecta", "Test", JOptionPane.ERROR_MESSAGE);
            } else {
                cerrar = false;
            }
        }

        int limPreguntas = 0;
        int respuesta = 0;
        String pregunta = "";
        int calificacion = 0;
        int incorrectas = 0;
        boolean contestada = false;
        while (limPreguntas < 10) {
            int tipo_pregunta = (int) (Math.random() * 4 + 1);
            switch (tipo_pregunta) {
                case 1://Suma
                    Suma suma = new Suma();
                    respuesta = suma.repuesta();
                    pregunta = suma.pregunta();
                    String opcionesArreglo1[] = Utilidades.obtenerOpciones(respuesta);
                    int pregunS = JOptionPane.showOptionDialog(null, "Seleccione la respuesta correcta:\n " + pregunta, "Examen Aritmetico UNL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArreglo1, opcionesArreglo1[0]);
                    if (opcionesArreglo1[pregunS].equals(String.valueOf(respuesta))) {
                        JOptionPane.showMessageDialog(null, "Respuesta Correcta", "UNL", JOptionPane.INFORMATION_MESSAGE);
                        contestada = true;
                        calificacion=calificacion+10;
                    } else {
                        contestada = false;
                        JOptionPane.showMessageDialog(null, "Respuesta Inorrecta\nCorrecion: " + pregunta + " =" + respuesta, "UNL", JOptionPane.INFORMATION_MESSAGE);
                        incorrectas=incorrectas+10;
                    }
                    break;
                case 2://RestaPregunta
                    Resta resta = new Resta();
                    respuesta = resta.repuesta();
                    pregunta = resta.pregunta();
                    String opcionesArreglo2[] = Utilidades.obtenerOpciones(respuesta);
                    int pregunR = JOptionPane.showOptionDialog(null, "Seleccione la respuesta correcta:\n " + pregunta, "Examen Aritmetico UNL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArreglo2, opcionesArreglo2[0]);
                    if (opcionesArreglo2[pregunR].equals(String.valueOf(respuesta))) {
                        JOptionPane.showMessageDialog(null, "Respuesta Correcta", "UNL", JOptionPane.INFORMATION_MESSAGE);
                        contestada = true;
                        calificacion=calificacion+10;
                    } else {
                        contestada = false;
                        JOptionPane.showMessageDialog(null, "Respuesta Inorrecta\nCorrecion: " + pregunta + " =" + respuesta, "UNL", JOptionPane.INFORMATION_MESSAGE);
                        incorrectas=incorrectas+10;
                    }
                    break;
                case 3://Multiplicacion
                    Multiplicación multiplicacion = new Multiplicación();
                    respuesta = multiplicacion.repuesta();
                    pregunta = multiplicacion.pregunta();
                    String opcionesArreglo3[] = Utilidades.obtenerOpciones(respuesta);
                    int pregunM = JOptionPane.showOptionDialog(null, "Seleccione la respuesta correcta:\n " + pregunta, "Examen Aritmetico UNL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArreglo3, opcionesArreglo3[0]);
                    if (opcionesArreglo3[pregunM].equals(String.valueOf(respuesta))) {
                        JOptionPane.showMessageDialog(null, "Respuesta Correcta", "UNL", JOptionPane.INFORMATION_MESSAGE);
                        contestada = true;
                        calificacion=calificacion+10;
                    } else {
                        contestada = false;
                        JOptionPane.showMessageDialog(null, "Respuesta Inorrecta\nCorrecion: " + pregunta + " =" + respuesta, "UNL", JOptionPane.INFORMATION_MESSAGE);
                        incorrectas=incorrectas+10;
                    }
                    break;
                case 4://Divicion
                    División divicion = new División();
                    respuesta = divicion.repuesta();
                    pregunta = divicion.pregunta();
                    String opcionesArreglo4[] = Utilidades.obtenerOpciones(respuesta);
                    int pregunD = JOptionPane.showOptionDialog(null, "Seleccione la respuesta correcta:\n " + pregunta, "Examen Aritmetico UNL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArreglo4, opcionesArreglo4[0]);
                    if (opcionesArreglo4[pregunD].equals(String.valueOf(respuesta))) {
                        JOptionPane.showMessageDialog(null, "Respuesta Correcta", "UNL", JOptionPane.INFORMATION_MESSAGE);
                        contestada = true;
                        calificacion=calificacion+10;
                    } else {
                        contestada = false;
                        JOptionPane.showMessageDialog(null, "Respuesta Inorrecta\nCorrecion: " + pregunta + " =" + respuesta, "UNL", JOptionPane.INFORMATION_MESSAGE);
                        incorrectas=incorrectas+10;
                    }
                    break;
            }

            Preguntas_Concretadas guardarPregunta = new Preguntas_Concretadas(cedula, pregunta, respuesta, contestada);
            preguntas.add(guardarPregunta);
            limPreguntas++;
        }
        JOptionPane.showMessageDialog(null, "Examen terminado con exito\n Cedula " + cedula + "\nResume:\n Correctas =" + calificacion + "\nIncorrectas " + incorrectas + "\nCalificacion " + calificacion, "UNL", JOptionPane.INFORMATION_MESSAGE);
    }

}
