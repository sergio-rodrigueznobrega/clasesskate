package org.palomafp.clasesskate;

import java.util.ArrayList;
import java.util.Random;

import org.palomafp.clasesskate.modelo.Alumno;
import org.palomafp.clasesskate.modelo.Grupo;
import org.palomafp.clasesskate.modelo.Profesor;
import org.palomafp.clasesskate.modelo.Skate;

/**
 * Clase que representa todos los grupos
 * 
 * @author Sergio y Débora
 */
public class GruposDAO {
    /**
     * Lista de grupos
     */
    ArrayList<Grupo> grupos = null;

    /**
     * Constructor de la clase GruposDAO
     */
    public GruposDAO() {
        // Crear lista de grupos vacía
        grupos = new ArrayList<>();

        // Crear listaAlumnos
        Alumno alumno1 = new Alumno(20, "Joan", "L4");
        Alumno alumno2 = new Alumno(21, "Marc", "L4");
        Alumno alumno3 = new Alumno(22, "Sarah", "L4");
        Alumno alumno4 = new Alumno(23, "Fede", "L4");
        Alumno alumno5 = new Alumno(24, "Pol", "L4");
        Alumno alumno6 = new Alumno(25, "Marta", "L2");
        Alumno alumno7 = new Alumno(26, "Laura", "L2");
        Alumno alumno8 = new Alumno(27, "Carlos", "L2");
        Alumno alumno9 = new Alumno(28, "Ana", "L2");
        Alumno alumno10 = new Alumno(29, "David", "L2");
        Alumno alumno11 = new Alumno(30, "Lucia", "L1");
        Alumno alumno12 = new Alumno(31, "Pablo", "L1");
        Alumno alumno13 = new Alumno(32, "Sofia", "L1");
        Alumno alumno14 = new Alumno(33, "Alberto", "L1");
        Alumno alumno15 = new Alumno(34, "Elena", "L1");
        Alumno alumno16 = new Alumno(35, "Mario", "L3");
        Alumno alumno17 = new Alumno(36, "Lucia", "L3");
        Alumno alumno18 = new Alumno(37, "Pablo", "L3");
        Alumno alumno19 = new Alumno(38, "Sofia", "L3");
        Alumno alumno20 = new Alumno(39, "Alberto", "L3");

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        ArrayList<Alumno> listaAlumnos2 = new ArrayList<>();
        listaAlumnos2.add(alumno6);
        listaAlumnos2.add(alumno7);
        listaAlumnos2.add(alumno8);
        listaAlumnos2.add(alumno9);
        listaAlumnos2.add(alumno10);
        ArrayList<Alumno> listaAlumnos3 = new ArrayList<>();
        listaAlumnos3.add(alumno11);
        listaAlumnos3.add(alumno12);
        listaAlumnos3.add(alumno13);
        listaAlumnos3.add(alumno14);
        listaAlumnos3.add(alumno15);
        ArrayList<Alumno> listaAlumnos4 = new ArrayList<>();
        listaAlumnos4.add(alumno16);
        listaAlumnos4.add(alumno17);
        listaAlumnos4.add(alumno18);
        listaAlumnos4.add(alumno19);
        listaAlumnos4.add(alumno20);
        // Crear skates
        Skate skate1 = new Skate(1, "Skateboard X", "Marca Y");
        Skate skate2 = new Skate(2, "Skateboard A", "Marca B");
        Skate skate3 = new Skate(3, "Skateboard C", "Marca D");
        Skate skate4 = new Skate(4, "Skateboard E", "Marca F");
        Skate skate5 = new Skate(5, "Skateboard G", "Marca H");
        Skate skate6 = new Skate(6, "Skateboard I", "Marca J");
        ArrayList<Skate> listaSkates = new ArrayList<>();
        listaSkates.add(skate1);
        listaSkates.add(skate2);
        ArrayList<Skate> listaSkates2 = new ArrayList<>();
        listaSkates2.add(skate3);
        listaSkates2.add(skate4);
        listaSkates2.add(skate5);
        ArrayList<Skate> listaSkates3 = new ArrayList<>();
        listaSkates3.add(skate6);

        // Crear profesores
        Profesor profesor = new Profesor(1, "Juan Pérez", "L4");
        Profesor profesor2 = new Profesor(2, "María Gómez", "L2");
        Profesor profesor3 = new Profesor(3, "Carlos Rodríguez", "L1");
        Profesor profesor4 = new Profesor(4, "Ana Martínez", "L3");

        // Crear un grupo
        Grupo grupo1 = new Grupo(1, "P4", "Lunes y Miércoles 5-7 PM", "L4", profesor);
        grupo1.setAlumnos(listaAlumnos);
        grupo1.setSkates(listaSkates);
        Grupo grupo2 = new Grupo(2, "P5", "Martes y Jueves 6-8 PM", "L2", profesor2);
        grupo2.setAlumnos(listaAlumnos2);
        grupo2.setSkates(listaSkates2);
        Grupo grupo3 = new Grupo(3, "P6", "Viernes 4-6 PM", "L1", profesor3);
        grupo3.setAlumnos(listaAlumnos3);
        grupo3.setSkates(listaSkates3);
        Grupo grupo4 = new Grupo(4, "P7", "Sábado 10 AM-12 PM", "L3", profesor4);
        grupo4.setAlumnos(listaAlumnos4);
        // AÑadir grupo a la lista
        grupos.add(grupo1);
        grupos.add(grupo2);
        grupos.add(grupo3);
        grupos.add(grupo4);
    }

    /**
     * Devuelve un grupo aleatorio
     * 
     * @return Un grupo aleatorio
     */
    public Grupo getGrupoRandom() {
        if (grupos.size() == 0) {
            return null;
        }
        Random aleatorio = new Random();
        int numgr = aleatorio.nextInt(grupos.size());
        return grupos.get(numgr);

    }

    /**
     * Devuelve un grupo por su código
     * 
     * @param codigo Código del grupo a buscar
     * @return El grupo con el código especificado o null si no existe
     */
    public Grupo getGrupoByCodigo(int codigo) {
        for (int i = 0; i < grupos.size(); i++) {
            Grupo grupo = grupos.get(i);
            if (grupo.getCodGrupo() == codigo) {
                return grupo;

            }
        }
        return null;
    }

    /**
     * Devuelve lista de grupos
     * 
     * @return Lista de grupos
     */
    public ArrayList<Grupo> getAllGrupos() {
        return grupos;
    }

}