package todo.repository;

import todo.Tarea;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TareaRepository {

    private final List<Tarea> tareas = new ArrayList<>(List.of(
            new Tarea(1L, "Estudiar Spring Boot", false),
            new Tarea(2L, "Preparar ejercicio FullStack", true),
            new Tarea(3L, "Entrenar para Ronda", false)
    ));

    public List<Tarea> findAll() {
        return tareas;
    }

    public Tarea findById(Long id) {
        return tareas.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void actualizar(Tarea tareaActualizada) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getId().equals(tareaActualizada.getId())) {
                tareas.set(i, tareaActualizada);
                return;
            }
        }
    }
}
