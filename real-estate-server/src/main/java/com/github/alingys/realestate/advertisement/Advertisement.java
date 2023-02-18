package com.github.alingys.realestate.advertisement;

import com.github.alingys.realestate.property.Property;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Advertisement {
    @Id
    @GeneratedValue
    private Long id;
    private Integer price;
    private String description;

//    private AdvertisementAction advertisementAction;



}
