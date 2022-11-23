package com.parker.willowlite.propertyserivce.controller;

import com.parker.willowlite.propertyserivce.dto.PropertyRequest;
import com.parker.willowlite.propertyserivce.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/property")
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService propertyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProperty(PropertyRequest propertyRequest){
        propertyService.createProperty(propertyRequest);
    }
}
