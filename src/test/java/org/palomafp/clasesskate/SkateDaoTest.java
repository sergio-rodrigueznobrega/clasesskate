package org.palomafp.clasesskate;



import org.palomafp.clasesskate.modelo.Grupo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
/**
 * Clase de test para la clase GruposDAO
 * @author Sergio y Débora
 */
public class SkateDaoTest {
    /**
     * Se crea un objeto GruposDAO para acceder a los grupos de la escuela de skate
     */
     GruposDAO dao = new GruposDAO();
     /**
      * Test para ver si devuelve null si está vacío
      */
     @Test
void testGetGrupoRandomNulo() {
    dao.getAllGrupos().clear();
    assertNull(dao.getGrupoRandom());
}
    /**
     * Test para ver si devuelve un grupo aleatorio
     */
    @Test
    void testGetAllGrupos() {
        ArrayList<Grupo> lista = dao.getAllGrupos();
        assertNotNull(lista);
        assertEquals(4, lista.size());
    }
    /**
     * Test para ver si devuelve un grupo por su código
     */
    @Test
    void testGetGrupoByCodigoExistente() {
        Grupo grupo = dao.getGrupoByCodigo(2);
        assertNotNull(grupo);
        assertEquals(2, grupo.getCodGrupo());
        assertEquals("P5", grupo.getLugar());
        assertEquals("Martes y Jueves 6-8 PM", grupo.getHorario());
        assertEquals("María Gómez", grupo.getProfesor().getNombre());

    }
    /**
     * Test para ver si devuelve null si el código no existe
     */
    @Test
    void testGetGrupoByCodigoNoExiste() {
        Grupo grupo = dao.getGrupoByCodigo(9);
        assertNull(grupo);
    }
    /**
     * Test para ver si devuelve un grupo aleatorio
     */
    @Test
    void testGetGrupoRandom() {
        Grupo grupoAleatorio = dao.getGrupoRandom();
        
        assertNotNull(grupoAleatorio);
        assertTrue(grupoAleatorio.getCodGrupo() >= 1 && grupoAleatorio.getCodGrupo() <= 4);
    }
   
    
}