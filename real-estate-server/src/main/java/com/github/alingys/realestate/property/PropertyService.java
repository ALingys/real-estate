package com.github.alingys.realestate.property;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class PropertyService {
    private final PropertyRepository propertyRepository;
    private final PropertyImageRepository propertyImageRepository;

    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    public PropertyImage createPropertyImage(Long propertyId, PropertyImage propertyImage){
        Property property = findById(propertyId);
        property.getPropertyImages().add(propertyImage);
        return propertyImageRepository.save(propertyImage);
    }

    public Property findById(Long id){
        return propertyRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "property not found"));
    }

    public List<Property> findAll() {
        return propertyRepository.findAll();
    }
}
