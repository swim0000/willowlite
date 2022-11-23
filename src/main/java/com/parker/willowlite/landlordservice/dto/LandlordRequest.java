package com.parker.willowlite.landlordservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LandlordRequest {

    private String name;
    private String email;
    private String telephone;
}
