package com.parker.willowlite.landlordservice.controller;

import com.parker.willowlite.landlordservice.dto.LandlordRequest;
import com.parker.willowlite.landlordservice.service.LandlordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/landlord")
@RequiredArgsConstructor
public class LandlordController {
    private final LandlordService landlordService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createLandlord(@RequestBody LandlordRequest landlordRequest){
        landlordService.createLandlord(landlordRequest);
    }
}
