package org.palomafp.clasesskate;



import org.palomafp.clasesskate.modelo.Grupo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
public class SkateDaoTest {
     GruposDAO dao = new GruposDAO();
    @Test
    void testGetAllGrupos() {
        ArrayList<Grupo> lista = dao.getAllGrupos();
        assertNotNull(lista);
        assertEquals(4, lista.size());
    }

    @Test
    void testGetGrupoByCodigoExistente() {
        Grupo grupo = dao.getGrupoByCodigo(2);
        assertNotNull(grupo);
        assertEquals(2, grupo.getCodGrupo());
        assertEquals("P5", grupo.getLugar());
        assertEquals("Martes y Jueves 6-8 PM", grupo.getHorario());
        assertEquals("María Gómez", grupo.getProfesor().getNombre());

    }

    @Test
    void testGetGrupoByCodigoNoExiste() {
        Grupo grupo = dao.getGrupoByCodigo(9);
        assertNull(grupo);
    }

    @Test
    void testGetGrupoRandom() {
        Grupo grupoAleatorio = dao.getGrupoRandom();
        
        assertNotNull(grupoAleatorio);
        assertTrue(grupoAleatorio.getCodGrupo() >= 1 && grupoAleatorio.getCodGrupo() <= 4);
    }
    
}