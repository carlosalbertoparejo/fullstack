package ediae.practica.hibernate.dto;

import java.time.LocalDate;

public class ClienteDTO {

    private Long id;
    private String nombre;
    private String email;
    private LocalDate fechaNacimiento;

    public ClienteDTO(Long id, String nombre, String email, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
