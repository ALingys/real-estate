package com.github.alingys.realestate.property;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PropertyImage {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private byte[] data;
}
