package org.palomafp.clasesskate;
import org.palomafp.clasesskate.modelo.Alumno;
import org.palomafp.clasesskate.modelo.Grupo;
import org.palomafp.clasesskate.modelo.Profesor;
import org.palomafp.clasesskate.modelo.Skate;

public class SkateDAO {

    
    public Grupo obtenerGrupo() {

        // Crear un profesor
        Profesor profesor = new Profesor(1, "Juan Pérez", "L4");
        

        // Crear un grupo
        Grupo grupo = new Grupo(1,"P4", "Lunes y Miércoles 5-7 PM", "L4");
        grupo.setProfesor(profesor);
        
        // Crear un skate
        Skate skate = new Skate(1, "Skateboard X", "Marca Y");

        // Crear un alumno
        Alumno alumno1 = new Alumno(20, "Joan", "L4");
        alumno1.setGrupo(grupo);
        alumno1.setSkate(skate);
        Alumno alumno2 = new Alumno(21, "Marc", "L4");
        alumno2.setGrupo(grupo);

        Alumno alumno3 = new Alumno(22, "Sarah", "L4");
        alumno3.setGrupo(grupo);

        Alumno alumno4 = new Alumno(23, "Fede", "L4");
        alumno4.setGrupo(grupo);

        Alumno alumno5 = new Alumno(24, "Pol", "L4");
        alumno5.setGrupo(grupo);

        return grupo;
    }

}