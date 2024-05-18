package cl.prueba.pruebajava.helper;

import cl.prueba.pruebajava.mysql.entity.Usuarios;
import cl.prueba.pruebajava.mysql.repository.UsuarioRepository;
import cl.prueba.pruebajava.util.ResponseMessageGenerico;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class ImplementacionService {

    @Autowired
    private Gson gson;

    @Autowired
    UsuarioRepository usuarioRepository;

    private static Logger logger = LogManager.getLogger(ImplementacionService.class);

    public ResponseEntity<ResponseMessageGenerico> listar() {
        logger.info("INICIO LISTAR USUARIO");
        logger.info("--------------------------------------------------------------------------------------------------------------------");
        ResponseMessageGenerico responseMessage = new ResponseMessageGenerico();
        List<Usuarios> usuarios = usuarioRepository.findAll();

        if(usuarios.size() > 0){
            responseMessage.setCode(10);
            responseMessage.setMessage("Lista usuarios encontrada");
        }else{
            responseMessage.setCode(1);
            responseMessage.setMessage("No se encuentran usuarios registrados");
        }
        responseMessage.setUsuarios(usuarios);
        logger.info("FIN LISTAR USUARIO");
        return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
    }


}
