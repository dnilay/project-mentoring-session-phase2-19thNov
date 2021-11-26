package com.example.helloworldrestapi.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "beer_table")
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="beer_id")
    private Integer beerId;
    @Column(name = "beer_name")
    private String beerName;
    @JsonEnumDefaultValue
    @Enumerated(EnumType.STRING)
    @Column(name = "beer_type")
    private BeerType beerType;
    @Column(name = "beer_price")
    private Double beerPrice;
}
