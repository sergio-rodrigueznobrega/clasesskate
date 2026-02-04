package org.palomafp.clasesskate.modelo;
public class Skate {
    private int codSkate;
    private String tipo;
    private String sistema;

    public Skate(int codSkate, String tipo, String sistema) {
        this.codSkate = codSkate;
        this.tipo = tipo;
        this.sistema = sistema;
    }

    // Getters y Setters
    public int getCodSkate() {
        return codSkate;
    }

    public void setCodSkate(int codSkate) {
        this.codSkate = codSkate;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "Skate{" +
                "codSkate=" + codSkate +
                ", tipo='" + tipo + '\'' +
                ", sistema='" + sistema + '\'' +
                '}';
    }
}
