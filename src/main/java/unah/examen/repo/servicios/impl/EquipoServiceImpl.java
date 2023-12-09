package unah.examen.repo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.examen.repo.modelos.Equipos;
import unah.examen.repo.repositorios.EquiposRepository;
import unah.examen.repo.servicios.EquiposService;

@Service
public class EquipoServiceImpl implements  EquiposService {

    @Autowired
    private EquiposRepository equiposRepository;

    @Override
    public Equipos crearEquipo(Equipos nvoEquipos) {
       return this.equiposRepository.save(nvoEquipos);
    }

    @Override
    public String eliminarEquipoPorId(int codigoEquipo) {
        Equipos equipoEliminar = this.equiposRepository.findById(codigoEquipo).get();

        if(equipoEliminar != null){
            this.equiposRepository.delete(equipoEliminar);
            return "Se elimino el equipo con el id: " + equipoEliminar.getCodigoEquipo(); 
        }

        return "No existe el equipo con el Id: " + codigoEquipo;
    }

    @Override
    public Equipos obtenerEquipoPorId(int id) {
        return this.equiposRepository.findById(id).get();
    }
    
}
