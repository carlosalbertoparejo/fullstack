CREATE TABLE clientes (
  id BIGINT NOT NULL AUTO_INCREMENT,
  email VARCHAR(255) NOT NULL,
  nombre VARCHAR(255) NOT NULL,
  fecha_nacimiento DATE,
  PRIMARY KEY (id),
  UNIQUE KEY uk_email (email)
);
