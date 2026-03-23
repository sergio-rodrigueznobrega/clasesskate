package org.palomafp.clasesskate;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.palomafp.clasesskate.modelo.Grupo;

/**
 * Clase principal que ejecuta la aplicación
 * 
 * @author Sergio y Débora
 */
public class App {
    /**
     * Constructor de la clase App
     */
    public App() {
    }

    /**
     * Método principal que ejecuta la aplicación
     * 
     * @param args Argumentos
     */
    public static void main(String[] args) {
        /**
         * Se crea Scanner para introducir datos por consola y se crea un objeto
         * GruposDAO para acceder a los grupos de la escuela de skate
         */
        Scanner sc = new Scanner(System.in);
        GruposDAO gruposDAO = new GruposDAO();
        int opcion;
        /**
         * Se muestra un menú con distintas opciones
         */
        do {
            System.out.println("Menú grupos Skate");
            System.out.println("1. Obtener grupo aleatorio");
            System.out.println("2. Buscar grupo por código");
            System.out.println("3. Ver total de grupos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida, introduce un número");
                sc.nextLine();
                opcion = 0;
            }
            /**
             * Se ejecuta la opción elegida por el usuario
             */
            switch (opcion) {
                case 1:
                    Grupo grupo = gruposDAO.getGrupoRandom();
                    System.out.println("El grupo aleaorio generado es: " + grupo);
                    break;
                case 2:
                    System.out.println("Introduce el código del grupo");
                    try {
                        int codigo = sc.nextInt();
                        Grupo grupoBuscado = gruposDAO.getGrupoByCodigo(codigo);
                        if (grupoBuscado != null) {
                            System.out.println("El grupo que buscas está en la pista: " + grupoBuscado.getLugar());
                            System.out.println("El profesor del grupo es: " + grupoBuscado.getProfesor().getNombre());
                            System.out.println("El horario del grupo es: " + grupoBuscado.getHorario());

                        } else {
                            System.out.println("No se ha encontrado el grupo con el código especificado.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Código no válido, introduce un número");
                        sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Total de grupos Encontrados: " + gruposDAO.getAllGrupos().size());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida, inténtalo de nuevo");
            }
        } while (opcion != 4);
        sc.close();

    }

}
