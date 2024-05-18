package cl.prueba.pruebajava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class LivenessController {

    private static Map<String, String> alwaysOk = Collections.singletonMap("status", "OK");

    @GetMapping("/liveness")
    public Map<String, String> testLiveness() {
        return alwaysOk;
    }
}

	
