package com.pokeapi.gurru.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name= "berries")
public class Berry {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer growthTime;
    private Integer maxHarvest;
    private Integer naturalGiftPower;
    private Integer size;
    private Integer smoothness;
    private Integer soilDryness;
    @ManyToOne
    @JoinColumn(name = "firmness_id")
    private Firmness firmness;

    @OneToMany
    @JoinColumn(name = "flavors_id")
    private List<Flavor> flavors;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne
    @JoinColumn(name = "naturalGiftType_id")
    private NaturalGiftType naturalGiftType;

}
