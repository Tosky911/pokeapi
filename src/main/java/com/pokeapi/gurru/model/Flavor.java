
package com.pokeapi.gurru.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "flavor")
public class Flavor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Integer potency;
    @ManyToOne
    @JoinColumn(name = "flavorValue_id")
    private FlavorValue flavorValue;

}
