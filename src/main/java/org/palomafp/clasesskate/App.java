package org.palomafp.clasesskate;


import java.util.Scanner;

import org.palomafp.clasesskate.modelo.Grupo;
/**
 * Clase principal que ejecuta la aplicación
 * @author Sergio y Débora
 */
public class App 
{
    /**
     * Método principal que ejecuta la aplicación 
     * @param args Argumentos
     */
    public static void main( String[] args ) { 
        /**
         * Se crea Scanner para introducir datos por consola y se crea un objeto GruposDAO para acceder a los grupos de la escuela de skate
         */
        Scanner sc = new Scanner(System.in);
        GruposDAO gruposDAO = new GruposDAO();
        int opcion;
        /**
         * Se muestra un menú con distintas opciones
         */
        do{
            System.out.println("Menú grupos Skate");
            System.out.println("1. Obtener grupo aleatorio");
            System.out.println("2. Buscar grupo por código");
            System.out.println("3. Ver total de grupos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            /**
             * Se ejecuta la opción elegida por el usuario
             */
            switch (opcion){
                case 1:
                    Grupo grupo = gruposDAO.getGrupoRandom();
                    System.out.println("El grupo aleaorio generado es: " + grupo);
                    break;
                case 2:
                    System.out.println("Introduce el código del grupo");
                    int codigo = sc.nextInt();
                     Grupo grupoBuscado = gruposDAO.getGrupoByCodigo(codigo);
                    if(grupoBuscado != null) {
                    System.out.println("El grupo que buscas está en la pista: " + grupoBuscado.getLugar());
                    System.out.println("El profesor del grupo es: " + grupoBuscado.getProfesor().getNombre());
                    System.out.println("El horario del grupo es: " + grupoBuscado.getHorario());

                    }else {
                    System.out.println("No se ha encontrado el grupo con el código especificado.");
                        }
                    break;
                case 3:
                    System.out.println("Total de grupos Encontrados: " + gruposDAO.getAllGrupos().size()); 
                    break;
                default:
                    System.out.println("Opción no valida, inténtalo de nuevo");
            }
        }while (opcion != 0);
        sc.close();

      
    
    }

}






