package org.palomafp.clasesskate;

import org.junit.jupiter.api.Test;
public class SkateDaoTest {

@Test
public void testObtenerGrupo() {
    SkateDAO skateDAO = new SkateDAO();
    Grupo grupo = skateDAO.obtenerGrupo();
    
    assertNotNull(grupo);
    assertEquals(1, grupo.getId());
    assertEquals("P4", grupo.getNombre());
    assertEquals("Lunes y Miércoles 5-7 PM", grupo.getHorario());
    assertEquals("L4", grupo.getAula());
}

@Test
public void testObtenerGrupoProfesor() {
    SkateDAO skateDAO = new SkateDAO();
    Grupo grupo = skateDAO.obtenerGrupo();
    
    assertNotNull(grupo.getProfesor());
    assertEquals("Juan Pérez", grupo.getProfesor().getNombre());
}

@Test
public void testObtenerGrupoAlumnos() {
    SkateDAO skateDAO = new SkateDAO();
    Grupo grupo = skateDAO.obtenerGrupo();
    
    assertNotNull(grupo);
    // Verify at least one student has a skateboard
    assertTrue(grupo.getAlumnos().stream()
        .anyMatch(a -> a.getSkate() != null));
}
}