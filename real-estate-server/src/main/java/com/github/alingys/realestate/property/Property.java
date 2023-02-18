package com.github.alingys.realestate.property;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Property {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "propertyType cannot be null")
    private PropertyType propertyType;
    @NotBlank
    private String municipality;
    @NotBlank
    private String settlement;
    @NotBlank
    private String street;
    @NotBlank
    private String houseNumber;
    private String flatNumber;
    @NotNull
    private Integer numberOfRooms;
    @NotNull
    private Integer area;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "property_id")
    private List<PropertyImage> propertyImages;
}
