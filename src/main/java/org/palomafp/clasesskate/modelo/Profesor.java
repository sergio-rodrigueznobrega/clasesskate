package org.palomafp.clasesskate.modelo;
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private int codProfe;
    private String nombre;
    private String nivel;
    private List<Grupo> grupos;

    public Profesor(int codProfe, String nombre, String nivel) {
        this.codProfe = codProfe;
        this.nombre = nombre;
        this.nivel = nivel;
        this.grupos = new ArrayList<>();
    }

    // Getters y Setters
    public int getCodProfe() {
        return codProfe;
    }

    public void setCodProfe(int codProfe) {
        this.codProfe = codProfe;
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

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void agregarGrupo(Grupo grupo) {
        if (!grupos.contains(grupo)) {
            grupos.add(grupo);
        }
    }

    public void eliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }

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
