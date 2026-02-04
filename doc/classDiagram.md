```mermaid
classDiagram

Profesor "1" --* "1....n" Grupo
    Grupo "1" --* "1....12" Alumno 
    Alumno "1" --> "1" Skate
    Grupo "1" --> "1....12" Skate

    class Profesor {
       - int: codProfe
       - String: nombre
       - String: nivel
       - grupos: List<Grupo
        
    }

    class Grupo {
       - int: codGrupo
       - String: lugar
       - Date: horario
       - String: nuvel
       - alumnos: List<Alumno
       - skates: List<Skate>
    }

     class Alumno {
       - int: CodAlumno
       - String: nombre
       - String: nivel
       - grupo: Grupo
       - skate: Skate
    }
        
    class Skate {
        - int: codSkate
        - String: tipo
        - String: sistema
    }
    ```

    