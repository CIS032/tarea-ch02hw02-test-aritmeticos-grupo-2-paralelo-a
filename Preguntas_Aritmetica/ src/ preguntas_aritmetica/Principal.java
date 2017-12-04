package preguntas_aritmeticas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AronChocama
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Preguntas_terminadas> preguntas = new ArrayList<>();
        while (true) {
            String menu = "1 -->Rendir Examen\n"
                    + "2 -->Administrar Examen\n"
                    + "3 --> Calificar Examen\n"
                    + "4 -->Salir\n";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    boolean cerrar = true;
                    String cedula = "";
                    while (cerrar) {
                        cedula = JOptionPane.showInputDialog(null, "Ingrese cedula para rendir el examen", "UNL", JOptionPane.QUESTION_MESSAGE);
                        if (cedula.length() < 1   || cedula.length ()>10){
                            JOptionPane.showMessageDialog(null, "Cedula Incorrecta", "Test", JOptionPane.ERROR_MESSAGE);
                        } else {
                            cerrar = false;
                        }
                    }

                    int limPreguntas = 0;
                    int respuesta = 0;
                    String pregunta = "";
                    int calificacion = 0;
                    int malas = 0;
                    boolean contestada = false;
                    while (limPreguntas < 10) {
                        int tipo_pregunta = (int) (Math.random() * 4 + 1);
                        switch (tipo_pregunta) {
                            case 1://Suma
                                Preguntas_suma suma = new Preguntas_suma();
                                respuesta = suma.Respuesta();
                                pregunta = suma.Pregunta();
                                String opcionesArreglo1[] = Utilidades.obtenerOpciones(respuesta);
                                int pregunS = JOptionPane.showOptionDialog(null, "Seleccione la respuesta correcta:\n " + pregunta, "Examen Aritmetico UNL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArreglo1, opcionesArreglo1[0]);
                                if (opcionesArreglo1[pregunS].equals(String.valueOf(respuesta))) {
                                    JOptionPane.showMessageDialog(null, "Respuesta Correcta", "UNL", JOptionPane.INFORMATION_MESSAGE);
                                    contestada = true;
                                    calificacion++;
                                } else {
                                    contestada = false;
                                    JOptionPane.showMessageDialog(null, "Respuesta Inorrecta\nCorrecion: " + pregunta + " =" + respuesta, "UNL", JOptionPane.INFORMATION_MESSAGE);
                                    malas++;
                                }
                                break;
                            case 2://RestaPregunta
                                Preguntas_Resta resta = new Preguntas_Resta();
                                respuesta = resta.Respuesta();
                                pregunta = resta.Pregunta();
                                String opcionesArreglo2[] = Utilidades.obtenerOpciones(respuesta);
                                int pregunR = JOptionPane.showOptionDialog(null, "Seleccione la respuesta correcta:\n " + pregunta, "Examen Aritmetico UNL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArreglo2, opcionesArreglo2[0]);
                                if (opcionesArreglo2[pregunR].equals(String.valueOf(respuesta))) {
                                    JOptionPane.showMessageDialog(null, "Respuesta Correcta", "UNL", JOptionPane.INFORMATION_MESSAGE);
                                    contestada = true;
                                    calificacion++;
                                } else {
                                    contestada = false;
                                    JOptionPane.showMessageDialog(null, "Respuesta Inorrecta\nCorrecion: " + pregunta + " =" + respuesta, "UNL", JOptionPane.INFORMATION_MESSAGE);
                                    malas++;
                                }
                                break;
                            case 3://Multiplicacion
                                Preguntas_Multiplicacion multiplicacion = new Preguntas_Multiplicacion();
                                respuesta = multiplicacion.Respuesta();
                                pregunta = multiplicacion.Pregunta();
                                String opcionesArreglo3[] = Utilidades.obtenerOpciones(respuesta);
                                int pregunM = JOptionPane.showOptionDialog(null, "Seleccione la respuesta correcta:\n " + pregunta, "Examen Aritmetico UNL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArreglo3, opcionesArreglo3[0]);
                                if (opcionesArreglo3[pregunM].equals(String.valueOf(respuesta))) {
                                    JOptionPane.showMessageDialog(null, "Respuesta Correcta", "UNL", JOptionPane.INFORMATION_MESSAGE);
                                    contestada = true;
                                    calificacion++;
                                } else {
                                    contestada = false;
                                    JOptionPane.showMessageDialog(null, "Respuesta Inorrecta\nCorrecion: " + pregunta + " =" + respuesta, "UNL", JOptionPane.INFORMATION_MESSAGE);
                                    malas++;
                                }
                                break;
                            case 4://Divicion
                                Preguntas_division divicion = new Preguntas_division();
                                respuesta = divicion.Respuesta();
                                pregunta = divicion.Pregunta();
                                String opcionesArreglo4[] = Utilidades.obtenerOpciones(respuesta);
                                int pregunD = JOptionPane.showOptionDialog(null, "Seleccione la respuesta correcta:\n " + pregunta, "Examen Aritmetico UNL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArreglo4, opcionesArreglo4[0]);
                                if (opcionesArreglo4[pregunD].equals(String.valueOf(respuesta))) {
                                    JOptionPane.showMessageDialog(null, "Respuesta Correcta", "UNL", JOptionPane.INFORMATION_MESSAGE);
                                    contestada = true;
                                    calificacion++;
                                } else {
                                    contestada = false;
                                    JOptionPane.showMessageDialog(null, "Respuesta Inorrecta\nCorrecion: " + pregunta + " =" + respuesta, "UNL", JOptionPane.INFORMATION_MESSAGE);
                                    malas++;
                                }
                                break;
                        }

                        Preguntas_terminadas guardarPregunta = new Preguntas_terminadas(cedula, pregunta, respuesta, contestada);
                        preguntas.add(guardarPregunta);
                        limPreguntas++;
                    }
                    JOptionPane.showMessageDialog(null, "Examen terminado con exito\n Cedula " + cedula + "\nResume:\n Correctas =" + calificacion + "\nIncorrectas " + malas + "\nCalificacion " + calificacion, "UNL", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    Banco_Preguntas.getPreguntas(preguntas);
                    break;
                case 3:
                    Banco_Preguntas.Revision(preguntas);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

}
