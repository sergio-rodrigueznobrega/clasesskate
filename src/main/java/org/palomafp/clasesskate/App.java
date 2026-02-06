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
        SkateDAO skateDAO = new SkateDAO();
        Grupo grupo = skateDAO.obtenerGrupo();
       System.out.println(grupo);

}

}






