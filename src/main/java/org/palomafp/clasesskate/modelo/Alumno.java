package org.palomafp.clasesskate.modelo;
public class Alumno {
    private int codAlumno;
    private String nombre;
    private String nivel;
    private Grupo grupo;
    private Skate skate;

    public Alumno(int codAlumno, String nombre, String nivel) {
        this.codAlumno = codAlumno;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Getters y Setters
    public int getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(int codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Skate getSkate() {
        return skate;
    }

    public void setSkate(Skate skate) {
        this.skate = skate;
    }

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
}
