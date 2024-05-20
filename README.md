# prueba-java



## Getting started

To make it easy for you to get started with GitLab, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!

## Add your files

- [ ] [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://github.com/Jtoro2602/api-usuarios.git
git branch -M main
git push -uf origin main
```

## BD
CREATE DATABASE pta;


    CREATE TABLE pta.usuarios (
	id_usuarios BIGSERIAL PRIMARY KEY,
	rut varchar NOT NULL,
	nombre varchar NOT NULL,
	apellido_paterno varchar NOT NULL,
	apellido_materno varchar NOT NULL,
	fono varchar NOT NULL,
	sexo varchar NULL,
	fecha_insert TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);


INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(1, '12345678-5', 'Jose', 'Paredez', 'Gonzalez', '+56989201889', 'Masculino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(2, '7654321-3', 'Juan Pablo', 'Paredez', 'Gonzalez', '+56989201229', 'Masculino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(3, '9876543-2', 'Michelle', 'Paredez', 'Gonzalez', '+56989901887', 'Femenino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(4, '22333444-1', 'Emilia', 'Paredez', 'Gonzalez', '+56989201381', 'Femenino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(5, '11222333-K', 'Alonso', 'Toro', 'Morales', '+56989002889', 'Masculino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(6, '14725896-7', 'Montserrat', 'Toro', 'Moralez', '+56999201899', 'Femenino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(7, '18234567-0', 'Alejandro', 'Morales', 'Cantillana', '+56989201985', 'Masculino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(8, '13579246-8', 'Rodolfo', 'Morales', 'Cantillana', '+56989201899', 'Masculino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(9, '10987654-6', 'Daniela', 'Morales', 'Cantillana', '+56989209780', 'Femenino', '2024-05-17 18:55:48.796');
INSERT INTO pta.usuarios
(id_usuarios, rut, nombre, apellido_paterno, apellido_materno, fono, sexo, fecha_insert)
VALUES(10, '8765432-1', 'Jonnathan', 'Toro', 'Jara', '+56989451889', 'Masculino', '2024-05-17 18:55:48.796');
