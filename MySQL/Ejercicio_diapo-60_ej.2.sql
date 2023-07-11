-- Verificar si la base de datos existe
SELECT SCHEMA_NAME
FROM INFORMATION_SCHEMA.SCHEMATA
WHERE SCHEMA_NAME = 'dt_prueba';

DROP DATABASE IF EXISTS dt_prueba;-- Si la base de datos existe, eliminarla
CREATE DATABASE dt_prueba; -- Crear la base de datos nuevamente

