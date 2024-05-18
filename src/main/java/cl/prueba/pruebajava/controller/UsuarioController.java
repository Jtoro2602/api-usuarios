package cl.prueba.pruebajava.controller;

import cl.prueba.pruebajava.helper.ImplementacionService;
import cl.prueba.pruebajava.util.ResponseMessageGenerico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

	@Autowired
	ImplementacionService implementacionService;

	@CrossOrigin
	@GetMapping ("/listar")
	public ResponseEntity<ResponseMessageGenerico> listar() {
		return implementacionService.listar();
	}

}
