/*CREATE SCHEMA IF NOT EXISTS usabana AUTHORIZATION fernando;

CREATE TABLE IF NOT EXISTS usabana.usuarios (
    id BIGSERIAL PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    numero_documento VARCHAR(50) UNIQUE NOT NULL
);
*/
INSERT INTO usabana.usuarios (nombres, apellidos, fecha_nacimiento, numero_documento)
VALUES ('Juan', 'Pérez', '1990-05-12', '123456789')
ON CONFLICT (numero_documento) DO NOTHING;