package com.parker.willowlite.propertyserivce.service;

import com.parker.willowlite.landlordservice.model.Landlord;
import com.parker.willowlite.propertyserivce.dto.PropertyRequest;
import com.parker.willowlite.propertyserivce.model.Property;
import com.parker.willowlite.propertyserivce.repository.PropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyService {

    private final PropertyRepository propertyRepository;

    public void createProperty(PropertyRequest propertyRequest){
        Property property = new Property().builder()
                .addressName(propertyRequest.getAddressName())
                .street(propertyRequest.getStreet())
                .townCity(propertyRequest.getTownCity())
                .postcode(propertyRequest.getPostcode())
                .build();
        propertyRepository.save(property);
    }
}
