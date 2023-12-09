package unah.examen.repo.servicios;

import unah.examen.repo.modelos.Equipos;

public interface EquiposService {

    public Equipos crearEquipo(Equipos nvoEquipos);

    public String eliminarEquipoPorId(int codigoEquipo);

    public Equipos obtenerEquipoPorId(int id);
}
