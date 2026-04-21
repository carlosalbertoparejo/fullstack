package ediae.practica.hibernate.dto;

import java.time.LocalDate;

public class ClientePostDTO {

    private String nombre;
    private String email;
    private LocalDate fechaNacimiento;

    public ClientePostDTO() {}

    public ClientePostDTO(String nombre, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
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
