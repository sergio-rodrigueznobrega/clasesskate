package org.palomafp.clasesskate.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un grupo de alumnos
 * 
 * @author Sergio y Débora
 */
public class Grupo {
    // Identificador del grupo
    private int codGrupo;
    // Lugar del grupo
    private String lugar;
    // Horario del grupo
    private String horario;
    // Nivel del grupo
    private String nivel;
    // Profesor del grupo
    private Profesor profesor;
    // Lista de alumnos del grupo
    private List<Alumno> alumnos;
    // Lista de skates del grupo
    private List<Skate> skates;

    /**
     * Constructor de la clase Grupo
     * 
     * @param codGrupo Código del grupo
     * @param lugar    Lugar del grupo
     * @param horario  Horario del grupo
     * @param nivel    Nivel del grupo
     * @param profesor Profesor del grupo
     *                 Se crean las liastad de alumnos y skates
     */
    public Grupo(int codGrupo, String lugar, String horario, String nivel, Profesor profesor) {
        this.codGrupo = codGrupo;
        this.lugar = lugar;
        this.horario = horario;
        this.nivel = nivel;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
        this.skates = new ArrayList<>();
    }

    /**
     * Obtiene el código del grupo
     * 
     * @return Código del grupo
     */
    public int getCodGrupo() {
        return codGrupo;
    }

    /**
     * Establece el código del grupo
     * 
     * @param codGrupo Código del grupo
     */
    public void setCodGrupo(int codGrupo) {
        this.codGrupo = codGrupo;
    }

    /**
     * Obtiene el lugar del grupo
     * 
     * @return Lugar del grupo
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Establece el lugar del grupo
     * 
     * @param lugar Lugar del grupo
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Obtiene el horario del grupo
     * 
     * @return Horario del grupo
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Establece el horario del grupo
     * 
     * @param horario Horario del grupo
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * Obtiene el nivel del grupo
     * 
     * @return Nivel del grupo
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Establece el nivel del grupo
     * 
     * @param nivel Nivel del grupo
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * Obtiene el profesor del grupo
     * 
     * @return Profesor del grupo
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Establece el profesor del grupo
     * 
     * @param profesor Profesor del grupo
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * Obtiene la lista de alumnos del grupo
     * 
     * @return Lista de alumnos del grupo
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * Establece la lista de alumnos del grupo
     * 
     * @param alumnos Lista de alumnos del grupo
     */
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * Obtiene la lista de skates del grupo
     * 
     * @return Lista de skates del grupo
     */
    public List<Skate> getSkates() {
        return skates;
    }

    /**
     * Establece la lista de skates del grupo
     * 
     * @param skates Lista de skates del grupo
     */
    public void setSkates(List<Skate> skates) {
        this.skates = skates;
    }

    /**
     * Agrega un alumno al grupo
     * 
     * @param alumno Alumno a agregar
     */
    public void agregarAlumno(Alumno alumno) {
        if (!alumnos.contains(alumno)) {
            alumnos.add(alumno);
            alumno.setGrupo(this);
        }
    }

    /**
     * Elimina un alumno del grupo y elimina al alumno del grupo
     * 
     * @param alumno Alumno a eliminar
     */
    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
        alumno.setGrupo(null);
    }

    /**
     * Agrega un skate al grupo
     * 
     * @param skate Skate a agregar
     */
    public void agregarSkate(Skate skate) {
        if (!skates.contains(skate)) {
            skates.add(skate);
        }
    }

    /**
     * Elimina un skate del grupo
     * 
     * @param skate Skate a eliminar
     */
    public void eliminarSkate(Skate skate) {
        skates.remove(skate);
    }

    /**
     * Devuelve el objeto Grupo
     * 
     * @return El objeto Grupo con sus atributos
     */
    @Override
    public String toString() {
        return "Grupo{" +
                "codGrupo=" + codGrupo +
                ", lugar='" + lugar + '\'' +
                ", horario=" + horario +
                ", nivel='" + nivel + '\'' +
                ", alumnos=" + alumnos.size() +
                ", skates=" + skates.size() +
                '}';
    }
}
