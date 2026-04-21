package ediae.practica.hibernate.service;

import ediae.practica.hibernate.dto.ClienteDTO;
import ediae.practica.hibernate.dto.ClientePostDTO;
import ediae.practica.hibernate.model.ClienteModel;
import ediae.practica.hibernate.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }


    private ClienteDTO toDTO(ClienteModel model) {
        return new ClienteDTO(
                model.getId(),
                model.getNombre(),
                model.getEmail(),
                model.getFechaNacimiento()
        );
    }

    private ClienteModel fromPostDTO(ClientePostDTO dto) {
        return new ClienteModel(
                dto.getNombre(),
                dto.getEmail(),
                dto.getFechaNacimiento()
        );
    }

 
    public List<ClienteDTO> listar() {
        return repo.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    public ClienteDTO buscar(Long id) {
        return repo.findById(id)
                .map(this::toDTO)
                .orElse(null);
    }

    public ClienteDTO crear(ClientePostDTO dto) {

        if (repo.existsByEmail(dto.getEmail())) {
            throw new RuntimeException("El email ya existe");
        }
    
        ClienteModel nuevo = fromPostDTO(dto);
        ClienteModel guardado = repo.save(nuevo);
        return toDTO(guardado);
    }
    


    public ClienteDTO actualizar(Long id, ClientePostDTO dto) {
        return repo.findById(id)
                .map(c -> {
                    c.setNombre(dto.getNombre());
                    c.setEmail(dto.getEmail());
                    c.setFechaNacimiento(dto.getFechaNacimiento());
                    return toDTO(repo.save(c));
                })
                .orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
