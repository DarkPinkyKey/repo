-- show schemas
-- create schema if not exists dt_test;
USE dt_test;

CREATE TABLE IF NOT EXISTS entidad(
  id_enre INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, 
  fecha DATE,
  texto TEXT,
  numero_entero INT,
  numero_decimal DECIMAL(7,5)
);

INSERT INTO entidad(fecha, texto, numero_entero, numero_decimal) 
VALUES ('2022-05-10', 'oidnosnfsd', 10, 2.48);

SELECT * FROM entidad;

