/* SELECT postalZip, region, country FROM mytable; */ -- Ejercicio 1 --

/*SELECT * FROM mytable
WHERE phone LIKE "(811)%"*/ -- Ejercicio 2 --

/*SELECT * FROM mytable
WHERE country IN ('Italy', 'Spain');*/ -- Ejercico 3 --

/* SELECT count(*) FROM mytable */ -- Ejercico 4 --

/* SELECT region, country, postalZip
FROM yourTable
WHERE id IN (
  SELECT id
  FROM yourTable
  WHERE country IN ('Alemania', 'Turquia')
)  */  -- Ejercico 5  --

/* SELECT MIN(id) AS menor_id, MAX(id) AS mayor_id FROM myTable; */ -- Ejercico 6 --

/* SELECT country, COUNT(*) AS total_registros FROM myTable
GROUP BY country ORDER BY total_registros DESC;
SELECT count(DISTINCT country) AS total_paises FROM mytable */ -- Ejercicio 7 --

/* SELECT id, postalZip FROM mytable
LIMIT 10; */ -- Ejercico 8 --

/* DELETE FROM yourTable
WHERE country = 'Singapore'; */ -- Ejercicio 9 --

