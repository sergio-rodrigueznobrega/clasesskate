package org.palomafp.clasesskate;


import org.palomafp.clasesskate.GruposDAO;
import org.palomafp.clasesskate.modelo.Grupo;
import org.junit.jupiter.api.Test;
public class SkateDaoTest {
    
@Test
 void testObtenerGrupoPorCodigo_NoExiste() {
        Grupo grupo = grupoDAO.getGrupoByCodigo(8);
        assertNull(grupo);
    }

@Test
 void testObtenerGrupoPorCodigo_Existe() {
        Grupo grupo = grupoDAO.getGrupoByCodigo(1);
        assertNotNull(grupo);
        assertEquals(1, grupo.getCodigo());
    }

@Test
   void testObtenerGrupos() {
        ArrayList<Grupo> grupos = grupoDAO.getAllGrupos();
        assertNotNull(grupos);
        assertFalse(grupos.isEmpty());
    }
@test
    void testObtenerGrupoRandom() {
        Grupo grupo = grupoDAO.getGrupoRandom();
        assertNotNull(grupo);
    }

}