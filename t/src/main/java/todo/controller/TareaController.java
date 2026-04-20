package todo.controller;

import todo.Tarea;
import todo.service.TareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private final TareaService service;

    public TareaController(TareaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarea> listarTareas() {
        return service.listarTareas();
    }

    @PutMapping("/{id}/completar")
    public Tarea completar(@PathVariable Long id) {
        return service.completarTarea(id);
    }

    @PutMapping("/{id}/descompletar")
    public Tarea desCompletar(@PathVariable Long id) {
        return service.desCompletarTarea(id);
    }
}
