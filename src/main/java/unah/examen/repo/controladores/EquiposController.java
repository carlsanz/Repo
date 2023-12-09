package unah.examen.repo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.examen.repo.modelos.Equipos;
import unah.examen.repo.servicios.impl.EquipoServiceImpl;

@RestController
@RequestMapping("/api/equipos")
public class EquiposController {
    
    @Autowired
    private EquipoServiceImpl equipoServiceImpl;

    @PostMapping("/crear")
    public Equipos crearEquipo(@RequestBody Equipos nvoEquipo){     
        if(nvoEquipo.getPosiciones() != null)   {
            nvoEquipo.getPosiciones().setEquipo(nvoEquipo);
        }
        return this.equipoServiceImpl.crearEquipo(nvoEquipo);
    }

    @DeleteMapping("/eliminar")
    public String eliminarEquipoPorId(@RequestParam(name="codigoequipo") int codigoequipo){
        return this.equipoServiceImpl.eliminarEquipoPorId(codigoequipo);
    }


    @GetMapping("/obtener/id")
   public Equipos obtenerEquipos(@RequestParam(name = "codigoequipo") int codigoequipo){
    return this.equipoServiceImpl.obtenerEquipoPorId(codigoequipo);
   }

}

