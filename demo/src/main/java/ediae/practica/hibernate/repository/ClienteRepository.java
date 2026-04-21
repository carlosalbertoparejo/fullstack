package ediae.practica.hibernate.repository;

import ediae.practica.hibernate.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
    boolean existsByEmail(String email);
}
