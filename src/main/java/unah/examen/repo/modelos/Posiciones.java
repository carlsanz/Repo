package unah.examen.repo.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posiciones")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Posiciones {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idposiciones")
    @Id
    private int idposiciones;
    
    private int empates;

    
    private int ganados;

    
    private int perdidos;

   @Column(name = "golesfavor")
    private int golesFavor;

    @Column(name = "golescontra")
    private int golesContra;

   
    private int puntos;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "codigoequipo", referencedColumnName = "codigoequipo")
    private Equipos equipo;


}
