package unah.examen.repo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.examen.repo.modelos.Posiciones;
import unah.examen.repo.servicios.impl.PosicionesServiceImpl;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionesController {
    
    @Autowired
    private PosicionesServiceImpl posicionesServiceImpl;

    @GetMapping("/tabla")
    public List<Posiciones> obtenerTablaPosiciones() {
        List<Posiciones> tablaPosiciones = posicionesServiceImpl.obtenerTablaPosiciones();
        return tablaPosiciones;
    }
}
