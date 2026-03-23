package org.palomafp.clasesskate.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un profesor
 * 
 * @author Sergio y Débora
 */

public class Profesor {
    // Código del profesor
    private int codProfe;
    // Nombre del profesor
    private String nombre;
    // Nivel del profesor
    private String nivel;
    // Lista de grupos del profesor
    private List<Grupo> grupos;

    /**
     * Constructor de la clase Profesor
     * 
     * @param codProfe Código del profesor
     * @param nombre   Nombre del profesor
     * @param nivel    Nivel del profesor
     */
    public Profesor(int codProfe, String nombre, String nivel) {
        this.codProfe = codProfe;
        this.nombre = nombre;
        this.nivel = nivel;
        this.grupos = new ArrayList<>();
    }

    /**
     * Obtiene el código del profesor
     * 
     * @return Código del profesor
     */
    public int getCodProfe() {
        return codProfe;
    }

    /**
     * Establece el código del profesor
     * 
     * @param codProfe Código del profesor
     */
    public void setCodProfe(int codProfe) {
        this.codProfe = codProfe;
    }

    /**
     * Obtiene el nombre del profesor
     * 
     * @return Nombre del profesor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del profesor
     * 
     * @param nombre Nombre del profesor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nivel del profesor
     * 
     * @return Nivel del profesor
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Establece el nivel del profesor
     * 
     * @param nivel Nivel del profesor
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * Obtiene la lista de grupos del profesor
     * 
     * @return Lista de grupos del profesor
     */
    public List<Grupo> getGrupos() {
        return grupos;
    }

    /**
     * Establece la lista de grupos del profesor
     * 
     * @param grupos Lista de grupos del profesor
     */
    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    /**
     * Agrega un grupo a la lista de grupos del profesor
     * 
     * @param grupo Grupo a agregar
     */
    public void agregarGrupo(Grupo grupo) {
        if (!grupos.contains(grupo)) {
            grupos.add(grupo);
        }
    }

    /**
     * Elimina un grupo de la lista de grupos del profesor
     * 
     * @param grupo Grupo a eliminar
     */
    public void eliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }

    /**
     * Devuelve Profesor
     * 
     * @return Profesor con sus respectivos atributos
     */
    @Override
    public String toString() {
        return "Profesor{" +
                "codProfe=" + codProfe +
                ", nombre='" + nombre + '\'' +
                ", nivel='" + nivel + '\'' +
                ", grupos=" + grupos.size() +
                '}';
    }
}
