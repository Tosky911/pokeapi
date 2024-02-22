
package com.pokeapi.gurru.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "flavor_value")
public class FlavorValue {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;

}
