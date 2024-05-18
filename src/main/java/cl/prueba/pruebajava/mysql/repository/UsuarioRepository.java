package cl.prueba.pruebajava.mysql.repository;



import cl.prueba.pruebajava.mysql.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;


public interface UsuarioRepository extends JpaRepository<Usuarios, BigInteger> {

}
