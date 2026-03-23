package org.palomafp.clasesskate.modelo;

/**
 * Clase que representa un alumno
 * 
 * @author Sergio y Débora
 */
public class Alumno {
    // Identificador único del alumno
    private int codAlumno;
    // Nombre del alumno
    private String nombre;
    // Nivel del alumno
    private String nivel;
    // Grupo del alumno
    private Grupo grupo;
    // Sakte del alumno
    private Skate skate;

    /**
     * Constructor de la clase Alumno
     * 
     * @param codAlumno Código del alumno
     * @param nombre    Nombre del alumno
     * @param nivel     Nivel del alumno
     */
    public Alumno(int codAlumno, String nombre, String nivel) {
        this.codAlumno = codAlumno;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    /**
     * Obtiene el código del alumno
     * 
     * @return Código del alumno
     */
    public int getCodAlumno() {
        return codAlumno;
    }

    /**
     * Establece el código del alumno
     * 
     * @param codAlumno Código del alumno
     */
    public void setCodAlumno(int codAlumno) {
        this.codAlumno = codAlumno;
    }

    /**
     * Obtiene el nombre del alumno
     * 
     * @return Nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno
     * 
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nivel del alumno
     * 
     * @return Nivel del alumno
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Establece el nivel del alumno
     * 
     * @param nivel Nivel del alumno
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * Obtiene el grupo del alumno
     * 
     * @return Grupo del alumno
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * Establece el grupo del alumno
     * 
     * @param grupo Grupo del alumno
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    /**
     * Obtiene el skate del alumno
     * 
     * @return Skate del alumno
     */
    public Skate getSkate() {
        return skate;
    }

    /**
     * Establece el skate del alumno
     * 
     * @param skate Skate del alumno
     */
    public void setSkate(Skate skate) {
        this.skate = skate;
    }

    /**
     * Devuelve Alumno
     * 
     * @return Alumno con sus respectivos atributos
     */
    @Override
    public String toString() {
        return "Alumno{" +
                "codAlumno=" + codAlumno +
                ", nombre='" + nombre + '\'' +
                ", nivel='" + nivel + '\'' +
                ", grupo=" + (grupo != null ? grupo.getCodGrupo() : "null") +
                ", skate=" + (skate != null ? skate.getCodSkate() : "null") +
                '}';
    }

    /**
     * Comprueba si dos alumnos son iguales por su código
     * 
     * @param o Objeto a comparar
     * @return true si los alumnos tienen el mismo código, false en caso contrario
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Alumno alumno = (Alumno) o;
        return codAlumno == alumno.codAlumno;
    }

    /**
     * Devuelve el código hash del alumno basado en su código identificador
     * 
     * @return Código hash del alumno
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(codAlumno);
    }
}
