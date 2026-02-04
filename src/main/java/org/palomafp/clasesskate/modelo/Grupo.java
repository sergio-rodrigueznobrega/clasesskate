package org.palomafp.clasesskate.modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Grupo {
    private int codGrupo;
    private String lugar;
    private Date horario;
    private String nivel;
    private Profesor profesor;
    private List<Alumno> alumnos;
    private List<Skate> skates;

    public Grupo(int codGrupo, String lugar, Date horario, String nivel) {
        this.codGrupo = codGrupo;
        this.lugar = lugar;
        this.horario = horario;
        this.nivel = nivel;
        this.alumnos = new ArrayList<>();
        this.skates = new ArrayList<>();
    }

    // Getters y Setters
    public int getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(int codGrupo) {
        this.codGrupo = codGrupo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Skate> getSkates() {
        return skates;
    }

    public void setSkates(List<Skate> skates) {
        this.skates = skates;
    }

    public void agregarAlumno(Alumno alumno) {
        if (!alumnos.contains(alumno)) {
            alumnos.add(alumno);
            alumno.setGrupo(this);
        }
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

    public void agregarSkate(Skate skate) {
        if (!skates.contains(skate)) {
            skates.add(skate);
        }
    }

    public void eliminarSkate(Skate skate) {
        skates.remove(skate);
    }

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
