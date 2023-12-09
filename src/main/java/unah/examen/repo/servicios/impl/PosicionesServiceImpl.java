package unah.examen.repo.servicios.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.examen.repo.modelos.Equipos;
import unah.examen.repo.modelos.Posiciones;
import unah.examen.repo.repositorios.EquiposRepository;
import unah.examen.repo.repositorios.PosicionesRepository;
import unah.examen.repo.servicios.PosicionesService;

@Service
public class PosicionesServiceImpl implements PosicionesService {

    @Autowired
    private PosicionesRepository posicionesRepository;

    @Autowired
    private EquiposRepository equiposRepository;

    @Override
    public List<Posiciones> obtenerTablaPosiciones() {
       return posicionesRepository.findAll();
    }
    
    
    public void simularYActualizarPosiciones() {
        List<Equipos> equipos = equiposRepository.findAll();

        for (Equipos local : equipos) {
            for (Equipos visitante : equipos) {
                if (!local.equals(visitante)) {
                    simularEncuentro(local, visitante);
                }
            }
        }
    }
    private int generarGoles() {
        return new Random().nextInt(5); // Puedes ajustar el rango según tus necesidades
    }

    public void simularEncuentro(Equipos local, Equipos visitante){
        int golesLocal = generarGoles();
        int golesVisitante = generarGoles();

        
    }

    

    
    
   

   



}
