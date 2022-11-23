package com.parker.willowlite.landlordservice.service;

import com.parker.willowlite.landlordservice.dto.LandlordRequest;
import com.parker.willowlite.landlordservice.model.Landlord;
import com.parker.willowlite.landlordservice.repository.LandlordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LandlordService {
    private final LandlordRepository landlordRepository;
    public void createLandlord(LandlordRequest landlordRequest){
        Landlord landlord = new Landlord().builder()
                .name(landlordRequest.getName())
                .email(landlordRequest.getEmail())
                .telephone(landlordRequest.getTelephone())
                .build();
        landlordRepository.save(landlord);
    }
}
