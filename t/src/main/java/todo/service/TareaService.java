package todo.service;

import todo.Tarea;
import todo.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    private final TareaRepository repo;

    public TareaService(TareaRepository repo) {
        this.repo = repo;
    }

    public List<Tarea> listarTareas() {
        return repo.findAll();
    }

    public Tarea completarTarea(Long id) {
        Tarea tarea = repo.findById(id);
        if (tarea != null) {
            tarea.setCompletada(true);
        }
        return tarea;
    }

    public Tarea desCompletarTarea (Long id) {
        Tarea tarea = repo.findById(id);
        if (tarea != null) {
            tarea.setCompletada(false);
            repo.actualizar(tarea);
        }
        return tarea;
    }

}
