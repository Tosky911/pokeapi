package com.pokeapi.gurru.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "firmness")
public class Firmness {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;

}
