package unah.examen.repo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.examen.repo.modelos.Equipos;

public interface EquiposRepository extends JpaRepository<Equipos, Integer> {
    
}
