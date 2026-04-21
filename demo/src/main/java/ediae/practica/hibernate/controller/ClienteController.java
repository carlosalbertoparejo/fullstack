package ediae.practica.hibernate.controller;

import ediae.practica.hibernate.dto.ClienteDTO;
import ediae.practica.hibernate.dto.ClientePostDTO;
import ediae.practica.hibernate.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    // GET - listar todos
    @GetMapping
    public List<ClienteDTO> listar() {
        return service.listar();
    }

    // GET - buscar por id
    @GetMapping("/{id}")
    public ClienteDTO buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    // POST - crear cliente
    @PostMapping
    public ClienteDTO crear(@RequestBody ClientePostDTO dto) {
        return service.crear(dto);
    }

    // PUT - actualizar cliente
    @PutMapping("/{id}")
    public ClienteDTO actualizar(@PathVariable Long id, @RequestBody ClientePostDTO dto) {
        return service.actualizar(id, dto);
    }

    // DELETE - eliminar cliente
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
