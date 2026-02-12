package org.palomafp.clasesskate;
import java.util.ArrayList;
import org.palomafp.clasesskate.modelo.Alumno;
import org.palomafp.clasesskate.modelo.Grupo;
import org.palomafp.clasesskate.modelo.Profesor;
import org.palomafp.clasesskate.modelo.Skate;

public class GruposDAO {

    ArrayList<Grupo> grupos = null;

    public GruposDAO() {
        //Crear lista de grupos vacía
        grupos = new ArrayList<>();

        //Crear listaAlumnos
        Alumno alumno1 = new Alumno(20, "Joan", "L4");
        Alumno alumno2 = new Alumno(21, "Marc", "L4");
        Alumno alumno3 = new Alumno(22, "Sarah", "L4");
        Alumno alumno4 = new Alumno(23, "Fede", "L4");
        Alumno alumno5 = new Alumno(24, "Pol", "L4");
        
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        
        //Crear skates
        Skate skate1 = new Skate(1, "Skateboard X", "Marca Y");
        Skate skate2 = new Skate(2, "Skateboard A", "Marca B");
        ArrayList<Skate> listaSkates = new ArrayList<>();
        listaSkates.add(skate1);
        listaSkates.add(skate2);

        // Crear profesores
        Profesor profesor = new Profesor(1, "Juan Pérez", "L4");
        
        // Crear un grupo
        Grupo grupo1 = new Grupo(1,"P4", "Lunes y Miércoles 5-7 PM", "L4", profesor);
        grupo1.setAlumnos(listaAlumnos);
        grupo1.setSkates(listaSkates);

        //AÑadir grupo a la lista
        grupos.add(grupo1);
    }

    public Grupo getGrupoRandom() {
        
        return grupos.getFirst();
    }

    public Grupo getGrupoByCodigo(int codigo) {
        return null;
    }

    public ArrayList<Grupo> getAllGrupos() {
        return grupos;
    }

}