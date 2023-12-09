package unah.examen.repo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "equipos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Equipos {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoequipo")
    @Id
    private int codigoEquipo;

   
    private String nombre;

   
    private double ataque;

    
    private double defensa;

    @OneToOne(mappedBy = "equipo")
    private Posiciones posiciones;

}
