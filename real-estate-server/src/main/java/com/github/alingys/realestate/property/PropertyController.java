package com.github.alingys.realestate.property;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/property")
public class PropertyController {
    private final PropertyService propertyService;

    @PostMapping("/")
    public Property createProperty(@Valid @RequestBody Property property){
        log.info("PropertyController.createProperty..");
        log.info(property.toString());

        return propertyService.createProperty(property);
    }
    @GetMapping("/")
    public List<Property> findAll(){
        log.info("PropertyController.findAll..");
        return propertyService.findAll();
    }

    @GetMapping("/{id}")
    public Property findById(@PathVariable("id") Long id){
        log.info("PropertyController.findById..: {}", id);
        return propertyService.findById(id);
    }

    @PostMapping("/{id}/image")
    public PropertyImage createPropertyImage(@PathVariable("id") Long propertyId, @RequestBody PropertyImage propertyImage){
        log.info("PropertyController.createPropertyImage..");
        return propertyService.createPropertyImage(propertyId, propertyImage);
    }

}
