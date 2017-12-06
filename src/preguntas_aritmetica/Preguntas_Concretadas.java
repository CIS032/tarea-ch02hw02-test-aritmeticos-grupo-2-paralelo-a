/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas_aritmetica;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Preguntas_Concretadas {

    private String cedula;
    private String pregunta;
    private int respuesta;
    private boolean contestada;

    public Preguntas_Concretadas() {
    }

    public Preguntas_Concretadas(String cedula, String pregunta, int respuesta, boolean contestada) {
        this.cedula = cedula;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.contestada = contestada;
    }
    //Geters and Seters

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isContestada() {
        return contestada;
    }

    public void setContestada(boolean contestada) {
        this.contestada = contestada;
    }

    //--------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Verificacion\n" + pregunta + " = " + respuesta + "\n" + " Su respuesta = " + contestada;
    }

    public Preguntas_Concretadas(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Preguntas_Concretadas other = (Preguntas_Concretadas) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

}
