package com.salesianostriana.dam.UD2EC02EJ1DelacruzGuillermo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(name = "first_name", nullable = false, length = 125)
    private String nombre;

}
