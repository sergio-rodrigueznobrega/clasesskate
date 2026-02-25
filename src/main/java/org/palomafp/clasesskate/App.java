package org.palomafp.clasesskate;


import org.palomafp.clasesskate.modelo.Grupo;

public class App 
{
    public static void main( String[] args )
    {
        GruposDAO gruposDAO = new GruposDAO();
        Grupo grupo = gruposDAO.getGrupoRandom();
       System.out.println("Grupo aleatorio: " + grupo);
       Grupo grupoBuscado = gruposDAO.getGrupoByCodigo(2);
    if(grupoBuscado != null) {
        System.out.println("El grupo que buscas está en la pista: " + grupoBuscado.getLugar());
        System.out.println("El profesor del grupo es: " + grupoBuscado.getProfesor().getNombre());
        System.out.println("El horario del grupo es: " + grupoBuscado.getHorario());

}else {
    System.out.println("No se ha encontrado el grupo con el código especificado.");
}
    System.out.println("Total de grupos Encontrados: " + gruposDAO.getAllGrupos().size()); 
    }

}






