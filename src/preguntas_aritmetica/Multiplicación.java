/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas_aritmetica;

/**
 *
 * @author Usuario
 */
public class Multiplicación implements PreguntasRespuesta {

    private int n1;
    private int n2;

    public Multiplicación() {
        n1 = (int) (Math.random() * 50);
        n2 = (int) (Math.random() * 50 + 1);
    }

    @Override
    public String pregunta() {
        return n1 + " * " + n2;
    }

    @Override
    public int repuesta() {
        return n1 * n2;
    }
}
