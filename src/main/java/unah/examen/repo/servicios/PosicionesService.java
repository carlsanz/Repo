package unah.examen.repo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import unah.examen.repo.modelos.Posiciones;
import unah.examen.repo.repositorios.PosicionesRepository;

public interface PosicionesService {
    
    List<Posiciones> obtenerTablaPosiciones();
}
