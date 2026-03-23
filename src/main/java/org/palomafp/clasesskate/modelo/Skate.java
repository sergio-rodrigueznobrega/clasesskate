package org.palomafp.clasesskate.modelo;

/**
 * Representa un skate disponible en la escuela de skate
 * 
 * @author Sergio y Débora
 */
public class Skate {
    // Identificador único del skate
    private int codSkate;
    // Tipo del Skate
    private String tipo;
    // Sistema del skate
    private String sistema;

    /**
     * Constructor de la clase Skate
     * 
     * @param codSkate Identificador único del skate
     * @param tipo     Tipo del Skate
     * @param sistema  Sistema del skate
     */
    public Skate(int codSkate, String tipo, String sistema) {
        this.codSkate = codSkate;
        this.tipo = tipo;
        this.sistema = sistema;
    }

    /**
     * Obtiene el código del skate
     * 
     * @return El código del skate
     */
    public int getCodSkate() {
        return codSkate;
    }

    /**
     * Establece el identificador del skate
     * 
     * @param codSkate El código del skate
     */
    public void setCodSkate(int codSkate) {
        this.codSkate = codSkate;
    }

    /**
     * Obtiene el tipo del skate
     * 
     * @return el tipo del skate
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del skate
     * 
     * @param tipo tipo del skate
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el sistema del skate
     * 
     * @return el sistema del skate
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Establece el sistema del skate
     * 
     * @param sistema sistema del skate
     */
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    /**
     * Devuelve el objeto Skate
     * 
     * @return El objeto Skate con sus atributos
     */
    @Override
    public String toString() {
        return "Skate{" +
                "codSkate=" + codSkate +
                ", tipo='" + tipo + '\'' +
                ", sistema='" + sistema + '\'' +
                '}';
    }
}
