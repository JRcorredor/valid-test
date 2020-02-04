DROP TABLE IF EXISTS users;
 
CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(250) NOT NULL,
  apellido VARCHAR(250) NOT NULL,
  procesado BOOLEAN NOT NULL,

);
 
INSERT INTO users (nombre, apellido, procesado) VALUES
  ('julian', 'corredor', 'Billionaire Industrialist')