
package com.pokeapi.gurru.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "natural_gift_type")
public class NaturalGiftType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String url;
}
