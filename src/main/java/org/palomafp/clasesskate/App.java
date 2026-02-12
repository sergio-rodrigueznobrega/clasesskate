package org.palomafp.clasesskate;


import org.palomafp.clasesskate.modelo.Grupo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GruposDAO gruposDAO = new GruposDAO();
        Grupo grupo = gruposDAO.getGrupoRandom();
       System.out.println(grupo);

}

}






